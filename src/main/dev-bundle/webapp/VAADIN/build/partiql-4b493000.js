function a(e,i){for(var t=0;t<i.length;t++){const r=i[t];if(typeof r!="string"&&!Array.isArray(r)){for(const o in r)if(o!=="default"&&!(o in e)){const p=Object.getOwnPropertyDescriptor(r,o);p&&Object.defineProperty(e,o,p.get?p:{enumerable:!0,get:()=>r[o]})}}}return Object.freeze(Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}))}var n={},s={get exports(){return n},set exports(e){n=e}};(function(e,i){(function(){ace.require(["ace/snippets/partiql"],function(t){e&&(e.exports=t)})})()})(s);const c=n,f=a({__proto__:null,default:c},[n]);export{f as p};