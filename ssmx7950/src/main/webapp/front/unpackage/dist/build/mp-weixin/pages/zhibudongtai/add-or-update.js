(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/zhibudongtai/add-or-update"],{"5e4f":function(e,n,t){"use strict";t.r(n);var r=t("a7d1"),a=t.n(r);for(var i in r)"default"!==i&&function(e){t.d(n,e,(function(){return r[e]}))}(i);n["default"]=a.a},7408:function(e,n,t){"use strict";(function(e){t("3409");r(t("66fd"));var n=r(t("7710"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},7710:function(e,n,t){"use strict";t.r(n);var r=t("cb57"),a=t("5e4f");for(var i in a)"default"!==i&&function(e){t.d(n,e,(function(){return a[e]}))}(i);t("bcdf");var u,o=t("f0c5"),c=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,"7f8ea81d",null,!1,r["a"],u);n["default"]=c.exports},9485:function(e,n,t){},a7d1:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function i(e,n,t,r,a,i,u){try{var o=e[i](u),c=o.value}catch(s){return void t(s)}o.done?n(c):Promise.resolve(c).then(r,a)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(r,a){var u=e.apply(n,t);function o(e){i(u,r,a,o,c,"next",e)}function c(e){i(u,r,a,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("4f3d"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{cross:"",ruleForm:{zhibumingcheng:"",fengmian:"",neirong:"",jinqidongtai:"",dengjishijian:""},user:{},ro:{zhibumingcheng:!1,fengmian:!1,neirong:!1,jinqidongtai:!1,dengjishijian:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var t=this;return u(r.default.mark((function a(){var i,u,o,c;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return t.ruleForm.dengjishijian=t.$utils.getCurDate(),i=e.getStorageSync("nowTable"),a.next=4,t.$api.session(i);case 4:if(u=a.sent,t.user=u.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=14;break}return t.ruleForm.id=n.id,a.next=12,t.$api.info("zhibudongtai",t.ruleForm.id);case 12:u=a.sent,t.ruleForm=u.data;case 14:if(t.cross=n.cross,!n.cross){a.next=42;break}o=e.getStorageSync("crossObj"),a.t0=r.default.keys(o);case 18:if((a.t1=a.t0()).done){a.next=42;break}if(c=a.t1.value,"zhibumingcheng"!=c){a.next=24;break}return t.ruleForm.zhibumingcheng=o[c],t.ro.zhibumingcheng=!0,a.abrupt("continue",18);case 24:if("fengmian"!=c){a.next=28;break}return t.ruleForm.fengmian=o[c],t.ro.fengmian=!0,a.abrupt("continue",18);case 28:if("neirong"!=c){a.next=32;break}return t.ruleForm.neirong=o[c],t.ro.neirong=!0,a.abrupt("continue",18);case 32:if("jinqidongtai"!=c){a.next=36;break}return t.ruleForm.jinqidongtai=o[c],t.ro.jinqidongtai=!0,a.abrupt("continue",18);case 36:if("dengjishijian"!=c){a.next=40;break}return t.ruleForm.dengjishijian=o[c],t.ro.dengjishijian=!0,a.abrupt("continue",18);case 40:a.next=18;break;case 42:t.styleChange();case 43:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},dengjishijianChange:function(e){this.ruleForm.dengjishijian=e.target.value,this.$forceUpdate()},fengmianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.fengmian="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(r.default.mark((function t(){var a,i,u,o,c,s,f,d,l,g;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!n.cross){t.next=16;break}if(o=e.getStorageSync("statusColumnName"),c=e.getStorageSync("statusColumnValue"),""==o){t.next=16;break}if(s=e.getStorageSync("crossObj"),o.startsWith("[")){t.next=12;break}for(f in s)f==o&&(s[f]=c);return d=e.getStorageSync("crossTable"),t.next=10,n.$api.update("".concat(d),s);case 10:t.next=16;break;case 12:a=Number(e.getStorageSync("userid")),i=s["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 16:if(!i||!a){t.next=38;break}return n.ruleForm.crossuserid=a,n.ruleForm.crossrefid=i,l={page:1,limit:10,crossuserid:a,crossrefid:i},t.next=22,n.$api.list("zhibudongtai",l);case 22:if(g=t.sent,!(g.data.total>=u)){t.next=28;break}return n.$utils.msg(e.getStorageSync("tips")),t.abrupt("return",!1);case 28:if(!n.ruleForm.id){t.next=33;break}return t.next=31,n.$api.update("zhibudongtai",n.ruleForm);case 31:t.next=35;break;case 33:return t.next=35,n.$api.add("zhibudongtai",n.ruleForm);case 35:n.$utils.msgBack("提交成功");case 36:t.next=46;break;case 38:if(!n.ruleForm.id){t.next=43;break}return t.next=41,n.$api.update("zhibudongtai",n.ruleForm);case 41:t.next=45;break;case 43:return t.next=45,n.$api.add("zhibudongtai",n.ruleForm);case 45:n.$utils.msgBack("提交成功");case 46:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,a=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,a=a>9?a:"0"+a,"".concat(t,"-").concat(r,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},bcdf:function(e,n,t){"use strict";var r=t("9485"),a=t.n(r);a.a},cb57:function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return i})),t.d(n,"a",(function(){return r}));var a=function(){var e=this,n=e.$createElement;e._self._c},i=[]}},[["7408","common/runtime","common/vendor"]]]);