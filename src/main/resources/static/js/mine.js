let ws;
layui.config({
    base: '/static/layui/lay/modules/' //扩展 JS 所在目录
});
layui.use(['layim', 'layer', 'jquery', 'contextMenu'], function () {
    let layim = layui.layim,
        $ = layui.$,
        contextMenu = layui.contextMenu,
        layer = layui.layer,
        cachedata =  layui.layim.cache();
    layim.config({
        init: {
            url: '/user/mine', //接口地址
        }
        , title: "小白IM"
        , members: {
            url: '/user/group_members' //接口地址
        }
        , msgbox: 'static/layui/css/modules/layim/html/msgbox.html' //消息盒子页面地址，若不开启，剔除该项即可
        , find: 'static/layui/css/modules/layim/html/find.html' //发现页面地址，若不开启，剔除该项即可
        , chatLog: 'static/layui/css/modules/layim/html/chatlog.html' //聊天记录页面地址，若不开启，剔除该项即可
        //可同时配置多个
        , about: true
        , tool: [{
            alias: 'code' //工具别名
            , title: '代码' //工具名称
            , icon: '&#xe64e;' //工具图标，参考图标文档
        }]
    });
    //面板初始化时候获取用户id
    layim.on("ready", function (data) {
        let wsUrl = "ws://" + window.location.host + "/websocket/" + data.mine.id;
        ws = new WebSocket(wsUrl);
        ws.onmessage = function (ev) {
            let chat = JSON.parse(ev.data);
            if (chat['chatType'] === 'chatMessage') {
                //聊天信息
                layim.getMessage(chat);
            } else if (chat['chatType'] === 'status') {
                //打开聊天窗口之后的更新
                if (chat['other'] === 'online') {
                    layim.setFriendStatus(chat['id'], 'online'); //设置指定好友在线，即头像取消置灰
                    layim.setChatStatus('<span style="color:#FF5722;">在线</span>');
                } else {
                    layim.setChatStatus('<span style="color:rgba(46,46,46,0.32);">离线</span>');
                    layim.setFriendStatus(chat['id'], 'offline'); //设置指定好友在线，即头像置灰
                }
            }
        };
        // menu.contextMenu();
    });

//发送消息
    layim.on("sendMessage", function (res) {
        ws.send(JSON.stringify({
            type: "chatMessage",
            data: res
        }))

    });
//监听消息已读或者未读
    layim.on('chatChange', function (res) {
        let type = res.data.type;
        //好友打开聊天窗口就代表消息已读
        if (type === 'friend') {
            ws.send(JSON.stringify({
                type: "chatChange",
                data: res.data
            }));
            // //模拟系统消息
            // layim.getMessage({
            //     system: true //系统消息
            //     , id: 111111111
            //     , type: "group"
            //     , content: '贤心加入群聊'
            // });
        }
    });
//修改在线状态
    layim.on('online', function (status) {
        $.get('/user/updateStatus', {status: status});
    });
//修改签名
    layim.on('sign', function (value) {
        $.get('/user/updateSign', {sign: value});
    });

// layim.add({
//     type: 'friend' //friend：申请加好友、group：申请加群
//     ,username: 'xxx' //好友昵称，若申请加群，参数为：groupname
//     ,avatar: 'a.jpg' //头像
//     ,submit: function(group, remark, index){ //一般在此执行Ajax和WS，以通知对方
//         console.log(group); //获取选择的好友分组ID，若为添加群，则不返回值
//         console.log(remark); //获取附加信息
//         layer.close(index); //关闭改面板
//     }
// });

    window.onunload = function () {
        ws.onclose = function () {
            layer.msg("服务器断开连接");
        }
    };

    // let menu = {
    //     contextMenu: function () {
    //         let my_spread = $('.layim-list-friend >li');
    //         my_spread.mousedown(function (e) {
    //             let data = {
    //                 contextItem: "context-friend", // 添加class
    //                 target: function (ele) { // 当前元素
    //                     $(".context-friend").attr("data-id", ele[0].id.replace(/[^0-9]/ig, "")).attr("data-name", ele.find("span").html());
    //                     $(".context-friend").attr("data-img", ele.find("img").attr('src')).attr("data-type", 'friend');
    //                 },
    //                 menu: []
    //             };
    //             data.menu.push(menu.menuNickName());
    //             let currentGroupidx = $(this).find('h5').data('groupidx');//当前分组id
    //             if (my_spread.length >= 2) { //当至少有两个分组时
    //                 let html = '<ul>';
    //                 for (let i = 0; i < my_spread.length; i++) {
    //                     let groupidx = my_spread.eq(i).find('h5').data('groupidx');
    //                     if (currentGroupidx != groupidx) {
    //                         let groupName = my_spread.eq(i).find('h5 span').html();
    //                         html += '<li class="ui-move-menu-item" data-groupidx="' + groupidx + '" data-groupName="' + groupName + '"><a href="javascript:void(0);"><span>' + groupName + '</span></a></li>'
    //                     }
    //                 }
    //                 ;
    //                 html += '</ul>';
    //                 data.menu.push(menu.menuMove(html));
    //             }
    //             data.menu.push(menu.menuRemove());
    //             $(".layim-list-friend >li > ul > li").contextMenu(data);
    //             //好友右键事件
    //         });
    //
    //         $(".layim-list-friend >li > h5").mousedown(function (e) {
    //             let data = {
    //                 contextItem: "context-mygroup", // 添加class
    //                 target: function (ele) { // 当前元素
    //                     $(".context-mygroup").attr("data-id", ele.data('groupidx')).attr("data-name", ele.find("span").html());
    //                 },
    //                 menu: []
    //             };
    //             if ($(this).parent().find('ul li').data('index') !== 0) {
    //                 data.menu.push(menu.menuDelMyGroup());
    //             }
    //             $(this).contextMenu(data);  //好友分组右键事件
    //         });
    //
    //
    //         $(".layim-list-group > li").mousedown(function (e) {
    //             let data = {
    //                 contextItem: "context-group", // 添加class
    //                 target: function (ele) { // 当前元素
    //                     $(".context-group").attr("data-id", ele[0].id.replace(/[^0-9]/ig, "")).attr("data-name", ele.find("span").html())
    //                         .attr("data-img", ele.find("img").attr('src')).attr("data-type", 'group')
    //                 },
    //                 menu: []
    //             };
    //             $(this).contextMenu(data);  //面板群组右键事件
    //         });
    //         $('.groupMembers > li').mousedown(function (e) {//聊天页面群组右键事件
    //             let data = {
    //                 contextItem: "context-group-member", // 添加class
    //                 isfriend: $(".context-group-member").data("isfriend"), // 添加class
    //                 target: function (ele) { // 当前元素
    //                     $(".context-group-member").attr("data-id", ele[0].id.replace(/[^0-9]/ig, ""));
    //                     $(".context-group-member").attr("data-img", ele.find("img").attr('src'));
    //                     $(".context-group-member").attr("data-name", ele.find("span").html());
    //                     $(".context-group-member").attr("data-isfriend", ele.attr('isfriend'));
    //                     $(".context-group-member").attr("data-manager", ele.attr('manager'));
    //                     $(".context-group-member").attr("data-groupidx", ele.parent().data('groupidx'));
    //                     $(".context-group-member").attr("data-type", 'friend');
    //                 },
    //                 menu: []
    //             };
    //             let _this = $(this);
    //             let groupInfo = conf.layim.thisChat().data;
    //             let _time = (new Date()).valueOf();//当前时间
    //             let _gagTime = parseInt(_this.attr('gagTime'));//当前禁言时间
    //
    //         })
    //     },
    //     delMyGroup: function(groupidx){//删除分组
    //         $.get('class/doAction.php?action=delMyGroup', {mygroupIdx:groupidx}, function (res) {
    //             let data = eval('(' + res + ')');
    //             if (data.code == 0) {
    //                 let group = $('.layim-list-friend li') || [];
    //                 for(let j = 0; j < group.length; j++){//遍历每一个分组
    //                     groupList = group.eq(j).find('h5').data('groupidx');
    //                     if(groupList === groupidx){//要删除的分组
    //                         if (group.eq(j).find('ul span').hasClass('layim-null')) {//删除的分组下没有好友
    //                             group.eq(j).remove();
    //                         }else{
    //                             // let html = group.eq(j).find('ul').html();//被删除分组的好友
    //                             let friend = group.eq(j).find('ul li');
    //                             let number = friend.length;//被删除分组的好友个数
    //                             for (let i = 0; i < number; i++) {
    //                                 let friend_id = friend.eq(i).attr('id').replace(/^layim-friend/g, '');//好友id
    //                                 let friend_name = friend.eq(i).find('span').html();//好友id
    //                                 let signature = friend.eq(i).find('p').html();//好友id
    //                                 let avatar = '../uploads/person/'+friend_id+'.jpg';
    //                                 let default_avatar = './uploads/person/empty2.jpg';
    //                                 conf.layim.removeList({//将好友从之前分组除去
    //                                     type: 'friend'
    //                                     ,id: friend_id //好友ID
    //                                 });
    //                                 // conf.layim.addList({//将好友移动到新分组
    //                                 //     type: 'friend'
    //                                 //     , avatar: im['IsExist'].call(this, avatar)?avatar:default_avatar //好友头像
    //                                 //     , username: friend_name //好友昵称
    //                                 //     , groupid: data.data //将好友添加到默认分组
    //                                 //     , id: friend_id //好友ID
    //                                 //     , sign: signature //好友签名
    //                                 // });
    //                             };
    //                         }
    //
    //                     }
    //                 }
    //                 im.contextMenu();
    //                 layer.close(layer.index);
    //             }else{
    //                 layer.msg(data.msg);
    //             }
    //         });
    //     },
    //     setAdmin: function(othis){
    //         let username = othis.data('id'),friend_avatar = othis.data('img'),
    //             isfriend = othis.data('isfriend'),name = othis.data('name'),
    //             gagTime = othis.data('gagtime'),groupidx = othis.data('groupidx');
    //         let options = {
    //             groupId: groupidx,
    //             username: username,
    //             success: function(resp) {
    //                 $.get('class/doAction.php?action=setAdmin', {groupidx:groupidx,memberIdx:username,type:2}, function (res) {
    //                     let admin = eval('(' + res + ')');
    //                     if (admin.code == 0) {
    //                         $("ul[data-groupidx="+groupidx+"] #"+username).remove();
    //                         let html = '<li id="'+username+'" isfriend="'+isfriend+'" manager="2" gagTime="'+gagTime+'"><img src="'+friend_avatar+'"><span style="color:#de6039">'+name+'</span><i class="layui-icon" style="color:#eaa48e"></i></li>'
    //                         $("ul[data-groupidx="+groupidx+"]").find('li').eq(0).after(html);
    //                         im.contextMenu();
    //                     }
    //                     layer.msg(admin.msg);
    //                 });
    //             },
    //             error: function(e){
    //             }
    //         };
    //         conn.setAdmin(options);
    //     },
    //     removeAdmin: function(othis){
    //         let username = othis.data('id'),friend_avatar = othis.data('img'),
    //             isfriend = othis.data('isfriend'),name = othis.data('name').split('<'),
    //             gagTime = othis.data('gagtime'),groupidx = othis.data('groupidx');
    //         let options = {
    //             groupId: groupidx,
    //             username: username,
    //             success: function(resp) {
    //                 $.get('class/doAction.php?action=setAdmin', {groupidx:groupidx,memberIdx:username,type:3}, function (res) {
    //                     let admin = eval('(' + res + ')');
    //                     if (admin.code == 0) {
    //                         $("ul[data-groupidx="+groupidx+"] #"+username).remove();
    //                         let html = '<li id="'+username+'" isfriend="'+isfriend+'" manager="3" gagTime="'+gagTime+'"><img src="'+friend_avatar+'"><span>'+name[0]+'</span></li>'
    //                         $("ul[data-groupidx="+groupidx+"]").append(html);
    //                         im.contextMenu();
    //                     }
    //                     layer.msg(admin.msg);
    //                 });
    //             },
    //             error: function(e){
    //             }
    //         };
    //         conn.removeAdmin(options);
    //     },
    //     leaveGroup: function(groupIdx,list,username){//list为数组
    //         $.get('class/doAction.php?action=leaveGroup',{list:list,groupIdx:groupIdx},function(res){
    //             let data = eval('(' + res + ')');
    //             if (data.code == 0) {
    //                 let options = {
    //                     roomId: groupIdx,
    //                     list: list,
    //                     success: function(resp){
    //                         console.log(resp);
    //                     },
    //                     error: function(e){
    //                         console.log(e);
    //                     }
    //                 };
    //                 conn.leaveGroup(options);
    //                 $("ul[data-groupidx="+groupIdx+"] #"+data.data).remove();
    //                 let index = layer.open();
    //                 layer.close(index);
    //             }
    //             layer.msg(data.msg);
    //         });
    //     },
    //     menuDelMyGroup: function(){
    //         return  data =  {
    //             text: "删除该组",
    //             icon: "&#x1006;",
    //             callback: function(ele) {
    //                 let othis = ele.parent(),mygroupIdx = othis.data('id');
    //                 layer.confirm('<div style="float: left;width: 17%;margin-top: 14px;"><i class="layui-icon" style="font-size: 48px;color:#cc4a4a">&#xe607;</i></div><div style="width: 83%;float: left;"> 选定的分组将被删除，组内联系人将会移至默认分组。</div>', {
    //                     btn: ['确定','取消'], //按钮
    //                     title:['删除分组','background:#b4bdb8'],
    //                     shade: 0
    //                 }, function(){
    //                     menu.delMyGroup(mygroupIdx);
    //                 }, function(){
    //                     let index = layer.open();
    //                     layer.close(index);
    //                 });
    //             }
    //         }
    //     },
    //     menuMove: function(html){
    //         return data = {
    //             text: "移动联系人",
    //             icon: "&#xe630;",
    //             nav: "move",//子导航的样式
    //             navIcon: "&#xe602;",//子导航的图标
    //             navBody: html,//子导航html
    //             callback: function(ele) {
    //                 let friend_id = ele.parent().data('id');//要移动的好友id
    //                 friend_name = ele.parent().data('name');
    //                 let avatar = '../uploads/person/'+friend_id+'.jpg';
    //                 let default_avatar = './uploads/person/empty2.jpg';
    //                 let signature = $('.layim-list-friend').find('#layim-friend'+friend_id).find('p').html();//获取签名
    //                 let item = ele.find("ul li");
    //                 item.hover(function() {
    //                     let _this = item.index(this);
    //                     let groupidx = item.eq(_this).data('groupidx');//将好友移动到分组的id
    //                     $.get('class/doAction.php?action=moveFriend',{friend_id:friend_id,groupidx:groupidx},function(res){
    //                         let data = eval('(' + res + ')');
    //                         if (data.code == 0) {
    //                             conf.layim.removeList({//将好友从之前分组除去
    //                                 type: 'friend'
    //                                 ,id: friend_id //好友ID
    //                             });
    //                             conf.layim.addList({//将好友移动到新分组
    //                                 type: 'friend'
    //                                 , avatar: im['IsExist'].call(this, avatar)?avatar:default_avatar //好友头像
    //                                 , username: friend_name //好友昵称
    //                                 , groupid: groupidx //所在的分组id
    //                                 , id: friend_id //好友ID
    //                                 , sign: signature //好友签名
    //                             });
    //                         }
    //                         layer.msg(data.msg);
    //                     });
    //                 });
    //             }
    //         }
    //     },
    //     menuRemove: function(){
    //         return data = {
    //             text: "删除好友",
    //             icon: "&#xe640;",
    //             events: "removeFriends",
    //             callback: function(ele) {
    //                 let othis = ele.parent(),friend_id = othis.data('id'),username,sign;
    //                 layui.each(cachedata.friend, function(index1, item1){
    //                     layui.each(item1.list, function(index, item){
    //                         if (item.id === friend_id) {
    //                             username = item.username;
    //                             sign = item.sign;
    //                         }
    //                     });
    //                 });
    //                 layer.confirm('删除后对方将从你的好友列表消失，且以后不会再接收此人的会话消息。<div class="layui-layim-list"><li layim-event="chat" data-type="friend" data-index="0"><img src="./uploads/person/'+friend_id+'.jpg"><span>'+username+'</span><p>'+sign+'</p></li></div>', {
    //                     btn: ['确定','取消'], //按钮
    //                     title:['删除好友','background:#b4bdb8'],
    //                     shade: 0
    //                 }, function(){
    //                     menu.removeFriends(friend_id);
    //                 }, function(){
    //                     let index = layer.open();
    //                     layer.close(index);
    //                 });
    //             }
    //         }
    //     },
    //     menuLeaveGroupBySelf: function(){
    //         return  data =  {
    //             text: "退出该群",
    //             icon: "&#xe613;",
    //             callback: function(ele) {
    //                 let othis = ele.parent(),
    //                     group_id = othis.data('id'),
    //                     groupname = othis.data('name');
    //                 avatar = othis.data('img');
    //                 layer.confirm('您真的要退出该群吗？退出后你将不会再接收此群的会话消息。<div class="layui-layim-list"><li layim-event="chat" data-type="friend" data-index="0"><img src="'+avatar+'"><span>'+groupname+'</span></li></div>', {
    //                     btn: ['确定','取消'], //按钮
    //                     title:['提示','background:#b4bdb8'],
    //                     shade: 0
    //                 }, function(){
    //                     let user = cachedata.mine.id;
    //                     let username = cachedata.mine.username;
    //                     im.leaveGroupBySelf(user,username,group_id);
    //                 }, function(){
    //                     let index = layer.open();
    //                     layer.close(index);
    //                 });
    //             }
    //         }
    //     },
    //     removeFriends: function (username) {
    //         // conn.removeRoster({
    //         //     to: username,
    //         //     success: function () {  // 删除成功
    //         //         $.get('class/doAction.php?action=removeFriends', {friend_id: username}, function (res) {
    //         //             let data = eval('(' + res + ')');
    //         //             if (data.code == 0) {
    //         //                 let index = layer.open();
    //         //                 layer.close(index);
    //         //                 conf.layim.removeList({//从我的列表删除
    //         //                     type: 'friend' //或者group
    //         //                     ,id: username //好友或者群组ID
    //         //                 });
    //         //                 im.removeHistory({//从我的历史列表删除
    //         //                     type: 'friend' //或者group
    //         //                     ,id: username //好友或者群组ID
    //         //                 });
    //         //                 parent.location.reload();
    //         //             }else{
    //         //                 layer.msg(data.msg);
    //         //             }
    //         //         });
    //         //
    //         //
    //         //     },
    //         //     error: function () {
    //         //         console.log('removeFriends faild');
    //         //         // 删除失败
    //         //     }
    //         // });
    //     },
    //     IsExist: function (avatar){ //判断头像是否存在
    //         let ImgObj=new Image();
    //         ImgObj.src= avatar;
    //         if(ImgObj.fileSize > 0 || (ImgObj.width > 0 && ImgObj.height > 0))
    //         {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     },
    //     menuNickName: function(){
    //         return data =  {
    //             text: "修改好友备注",
    //             icon: "&#xe6b2;",
    //             callback: function(ele) {
    //                 let othis = ele.parent(),friend_id = othis.data('id'),friend_name = othis.data('name');
    //                 layer.prompt({title: '修改备注姓名', formType: 0,value: friend_name}, function(nickName, index){
    //                     $.get('class/doAction.php?action=editNickName',{nickName:nickName,friend_id:friend_id},function(res){
    //                         let data = eval('(' + res + ')');
    //                         if (data.code == 0) {
    //                             let friendName = $("#layim-friend"+friend_id).find('span');
    //                             friendName.html(data.data);
    //                             layer.close(index);
    //                         }
    //                         layer.msg(data.msg);
    //                     });
    //                 });
    //
    //             }
    //         }
    //     },
    //
    // };
    return false;

})
;
