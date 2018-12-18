
INSERT INTO authority(authority) VALUES ('LIST'), ('CREATE'),('UPDATE'),('DELETE');

INSERT INTO authority(authority) VALUES ('CREATE_CALL');

INSERT INTO groups(group_name) VALUES ('ADMIN'),('CLIENT'),('USER');

INSERT INTO groups_authority(Groups_id,authority_id) 
VALUES 
	((select g.id from groups g where g.group_name='ADMIN'),(select a.id from authority a where a.authority = 'CREATE'));

INSERT INTO groups_authority(Groups_id,authority_id) 
VALUES 
    ((select g.id from groups g where g.group_name='ADMIN'),(select a.id from authority a where a.authority = 'LIST')),
    ((select g.id from groups g where g.group_name='ADMIN'),(select a.id from authority a where a.authority = 'UPDATE')),
    ((select g.id from groups g where g.group_name='ADMIN'),(select a.id from authority a where a.authority = 'DELETE'))
    ;

INSERT INTO groups_authority(Groups_id,authority_id) 
VALUES 
	((select g.id from groups g where g.group_name='CLIENT'),(select a.id from authority a where a.authority = 'CREATE_CALL'));

INSERT INTO groups_authority(Groups_id,authority_id) 
VALUES 
    ((select g.id from groups g where g.group_name='USER'),(select a.id from authority a where a.authority = 'LIST'));



INSERT INTO `credentials` (`username`, `enabled`, `password`) VALUES ('admin1', 1, '$2b$10$qNyyDlO7M3l66M79ZTOr..1KwGY6NwwsYXwe7nU94.tz2j9fdVoni');
INSERT INTO `credentials` (`username`, `enabled`, `password`) VALUES ('user1', 1, '$2b$10$qNyyDlO7M3l66M79ZTOr..1KwGY6NwwsYXwe7nU94.tz2j9fdVoni');


INSERT INTO user(firstName, lastName, credentialId)
VALUES
('ADMIN USER','A','admin1'),
('Regular USER','U','user1')
;


INSERT INTO groups_credentials (Groups_id, userCredentials_username)
SELECT (select g.id from groups g where g.group_name='CLIENT') as group_id, cd.username
FROM credentials cd
WHERE cd.username not in ('admin1','user1');

INSERT INTO groups_credentials (Groups_id, userCredentials_username)
VALUES 
((select g.id from groups g where g.group_name='USER'), 'user1'),
((select g.id from groups g where g.group_name='ADMIN'), 'admin1')
;


update credentials
set password = '$2a$10$6nNT2YTKzy/aHcnow1TWce8hO1QBDtKw.h9qrP0UsX9ILYNNMlzvq' -- password is Bill
;

commit;