CREATE TABLE  IF NOT EXISTS states (
  id Integer(10) NOT NULL AUTO_INCREMENT,
  state_name varchar(225) NOT NULL,
  state_code varchar(225) NOT NULL,
  state_capital varchar(225) NOT NULL DEFAULT '',
  state_governor varchar(225) NOT NULL DEFAULT '',
  PRIMARY KEY(id, state_code)
);


insert into states (state_code, state_name) values ('AL','Alabama');
insert into states (state_code, state_name) values ('AK','Alaska');
insert into states (state_code, state_name) values ('AS','American Samoa');
insert into states (state_code, state_name) values ('AZ','Arizona');
insert into states (state_code, state_name) values ('AR','Arkansas');
insert into states (state_code, state_name) values ('CA','California');
insert into states (state_code, state_name) values ('CO','Colorado');
insert into states (state_code, state_name) values ('CT','Connecticut');
insert into states (state_code, state_name) values ('DE','Delaware');
insert into states (state_code, state_name) values ('DC','District of Columbia');
insert into states (state_code, state_name) values ('FM','Federated States of Micronesia');
insert into states (state_code, state_name) values ('FL','Florida');
insert into states (state_code, state_name) values ('GA','Georgia');
insert into states (state_code, state_name) values ('GU','Guam');
insert into states (state_code, state_name) values ('HI','Hawaii');
insert into states (state_code, state_name) values ('ID','Idaho');
insert into states (state_code, state_name) values ('IL','Illinois');
insert into states (state_code, state_name) values ('IN','Indiana');
insert into states (state_code, state_name) values ('IA','Iowa');
insert into states (state_code, state_name) values ('KS','Kansas');
insert into states (state_code, state_name) values ('KY','Kentucky');
insert into states (state_code, state_name) values ('LA','Louisiana');
insert into states (state_code, state_name) values ('ME','Maine');
insert into states (state_code, state_name) values ('MH','Marshall Islands');
insert into states (state_code, state_name) values ('MD','Maryland');
insert into states (state_code, state_name) values ('MA','Massachusetts');
insert into states (state_code, state_name) values ('MI','Michigan');
insert into states (state_code, state_name) values ('MN','Minnesota');
insert into states (state_code, state_name) values ('MS','Mississippi');
insert into states (state_code, state_name) values ('MO','Missouri');
insert into states (state_code, state_name) values ('MT','Montana');
insert into states (state_code, state_name) values ('NE','Nebraska');
insert into states (state_code, state_name) values ('NV','Nevada');
insert into states (state_code, state_name) values ('NH','New Hampshire');
insert into states (state_code, state_name) values ('NJ','New Jersey');
insert into states (state_code, state_name) values ('NM','New Mexico');
insert into states (state_code, state_name) values ('NY','New York');
insert into states (state_code, state_name) values ('NC','North Carolina');
insert into states (state_code, state_name) values ('ND','North Dakota');
insert into states (state_code, state_name) values ('MP','Northern Mariana Islands');
insert into states (state_code, state_name) values ('OH','Ohio');
insert into states (state_code, state_name) values ('OK','Oklahoma');
insert into states (state_code, state_name) values ('OR','Oregon');
insert into states (state_code, state_name) values ('PW','Palau');
insert into states (state_code, state_name) values ('PA','Pennsylvania');
insert into states (state_code, state_name) values ('PR','Puerto Rico');
insert into states (state_code, state_name) values ('RI','Rhode Island');
insert into states (state_code, state_name) values ('SC','South Carolina');
insert into states (state_code, state_name) values ('SD','South Dakota');
insert into states (state_code, state_name) values ('TN','Tennessee');
insert into states (state_code, state_name) values ('TX','Texas');
insert into states (state_code, state_name) values ('UT','Utah');
insert into states (state_code, state_name) values ('VT','Vermont');
insert into states (state_code, state_name) values ('VI','Virgin Islands');
insert into states (state_code, state_name) values ('VA','Virginia');
insert into states (state_code, state_name) values ('WA','Washington');
insert into states (state_code, state_name) values ('WV','West Virginia');
insert into states (state_code, state_name) values ('WI','Wisconsin');
insert into states (state_code, state_name) values ('WY','Wyoming');