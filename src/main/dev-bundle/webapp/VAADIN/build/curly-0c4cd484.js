function u(e,c){for(var r=0;r<c.length;r++){const t=c[r];if(typeof t!="string"&&!Array.isArray(t)){for(const o in t)if(o!=="default"&&!(o in e)){const s=Object.getOwnPropertyDescriptor(t,o);s&&Object.defineProperty(e,o,s.get?s:{enumerable:!0,get:()=>t[o]})}}}return Object.freeze(Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}))}var n={},f={get exports(){return n},set exports(e){n=e}};(function(e,c){(function(){ace.require(["ace/snippets/curly"],function(r){e&&(e.exports=r)})})()})(f);const i=n,a=u({__proto__:null,default:i},[n]);export{a as c};