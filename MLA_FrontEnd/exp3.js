let products = new Map();

products.set(1,"Apple");
products.set(2,"Lenovo");
products.set(3,"Dell");
products.set(4,"Hp");
products.set(5,"ASUS");

// document.writeln(products);

document.writeln("Size of Map : "+products.size());
document.writeln(products.keys);
document.writeln(products.values);

products.array.forEach(element =>{
    document.writeln(element);
});

function dataPrint(keys, values){
    document.writeln(keys+"  "+values);
}

products.forEach(dataPrint);
