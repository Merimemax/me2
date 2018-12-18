select email from client cl, credentials cr where cl.credentialId = cr.username;
select cl.email, cd.fromNumber, cd.toNumber, cd.duration from call_details cd, client cl where cd.fromNumber = cl.mobileNumber;
