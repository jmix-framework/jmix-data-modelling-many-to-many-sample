function s(e,i){for(var t=0;t<i.length;t++){const r=i[t];if(typeof r!="string"&&!Array.isArray(r)){for(const o in r)if(o!=="default"&&!(o in e)){const g=Object.getOwnPropertyDescriptor(r,o);g&&Object.defineProperty(e,o,g.get?g:{enumerable:!0,get:()=>r[o]})}}}return Object.freeze(Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}))}var n={},c={get exports(){return n},set exports(e){n=e}};(function(e,i){(function(){ace.require(["ace/snippets/gitignore"],function(t){e&&(e.exports=t)})})()})(c);const f=n,a=s({__proto__:null,default:f},[n]);export{a as g};