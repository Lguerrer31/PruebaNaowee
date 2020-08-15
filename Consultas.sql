-- Punto 1
select * from SalesLT.Customer c JOIN SalesLT.CustomerAddress ca ON c.CustomerID = ca.CustomerID
-- Punto 2
select * from SalesLT.Customer c JOIN SalesLT.SalesOrderHeader s ON c.CustomerID = s.CustomerID
-- Punto 3
select (c.FirstName + ' ' + c.LastName) as "Name", c.CustomerID, s.SubTotal as Subtotal from SalesLT.SalesOrderHeader s JOIN SalesLT.Customer c ON c.CustomerID = s.CustomerID
where SubTotal > 3000 order by SubTotal DESC
-- Punto 4
select * from SalesLT.Customer where FirstName LIKE 'A%' or FirstName LIKE 'J%' order by FirstName asc
-- punto 5
select pc.Name, COUNT(*) as ProductCount from SalesLT.ProductCategory pc
join SalesLT.Product p on p.ProductCategoryID = pc.ProductCategoryID
group by pc.Name order by ProductCount desc

-- Punto 6
select * from SalesLT.Address a JOIN SalesLT.CustomerAddress ca ON a.AddressID = ca.AddressID
WHERE ca.AddressType = 'shipping' order by a.StateProvince asc

-- Punto 7
select od.SalesOrderID, COUNT(*) as ItemsCount from SalesLT.SalesOrderDetail od JOIN SalesLT.SalesOrderHeader oh ON od.SalesOrderID = oh.SalesOrderID
group by od.SalesOrderID order by ItemsCount desc

select * from SalesLT.Product
select * from SalesLT.SalesOrderHeader 
select * from SalesLT.SalesOrderDetail
select * from SalesLT.Address
select * from SalesLT.CustomerAddress