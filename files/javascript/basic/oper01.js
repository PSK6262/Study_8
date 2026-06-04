let x = 10;
let y = 10;
let z = '10';
console.log( x + y );
console.log( x - y );
console.log( x + z ); // java랑 같다


console.log( x == y ); // 값
console.log( x == z ); 
console.log( x === y ); // 값 + 타입
console.log( x === z );

console.log(x+Number(z)); // Number() , String()만 알면 된다
console.log(x+String(y));

if ( x == 10 ){
    console.log('x == 10');
}

console.log( 10 == 10.0 );
console.log( 10 === 10.0 );
console.log( Number('10') === Number('10.0'));