/** CLIENT **/
insert into client values 
	(1, 'Client 1'),
	(2, 'Client 2'),
	(3, 'Client 3');

/** SELLER **/
insert into seller values 
	(1, 'seller 1'),
	(2, 'seller 2');

/** PRODUCT **/
insert into product values 
	(1, 'Product 1', 20.5),
	(2, 'Product 2', 104.9),
	(3, 'Product 3', 78.5);

/** TRANSACTION **/
insert into transaction values 
	(1, curdate(), 0, 1, 1),
	(2, curdate(), 0, 2, 2),
	(3, curdate(), 0, 2, 2);

/** TRANSACTION DETAIL **/
insert into transaction_detail values 
	(1, 22, 1, 1),
	(2, 8, 2, 1),
	(3, 4, 3, 1);