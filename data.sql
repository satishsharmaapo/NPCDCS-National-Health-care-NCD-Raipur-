
/*Table structure for table `anm` */

DROP TABLE IF EXISTS `anm`;

CREATE TABLE `anm` (
  `anm_id` int(11) NOT NULL AUTO_INCREMENT,
  `anm_name` varchar(200) DEFAULT NULL,
  `anm_mob` int(11) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `sub_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`anm_id`),
  KEY `FK_anm` (`sub_id`),
  CONSTRAINT `FK_anm` FOREIGN KEY (`sub_id`) REFERENCES `shc` (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `anm` */

/*Table structure for table `cancer` */

DROP TABLE IF EXISTS `cancer`;

CREATE TABLE `cancer` (
  `cancer_id` int(11) NOT NULL AUTO_INCREMENT,
  `cancer_type` varchar(200) DEFAULT NULL,
  `cancer_value` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cancer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cancer` */

/*Table structure for table `cardiovascular` */

DROP TABLE IF EXISTS `cardiovascular`;

CREATE TABLE `cardiovascular` (
  `cardiovascular_id` int(11) NOT NULL AUTO_INCREMENT,
  `cardiovascular_type` varchar(200) DEFAULT NULL,
  `cardiovascular_value` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cardiovascular_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cardiovascular` */

/*Table structure for table `chc` */

DROP TABLE IF EXISTS `chc`;

CREATE TABLE `chc` (
  `chc_id` int(11) NOT NULL AUTO_INCREMENT,
  `district_id` int(11) DEFAULT NULL,
  `chc_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`chc_id`),
  KEY `FK_chc_rf_district` (`district_id`),
  CONSTRAINT `FK_chc_rf_district` FOREIGN KEY (`district_id`) REFERENCES `district` (`district_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3084 DEFAULT CHARSET=latin1;

/*Data for the table `chc` */

insert  into `chc`(`chc_id`,`district_id`,`chc_name`) values (3001,2001,'CHC BADE KILEPAL'),(3002,2001,'CHC BAKAWAND'),(3003,2001,'CHC BASTER (BLOCK PHC BASTAR)'),(3004,2001,'CHC DARBHA'),(3005,2001,'CHC JAGDALPUR'),(3006,2001,'CHC KESHKAL'),(3007,2001,'CHC KONDAGAON(BLOCK PHC KONDAGAON)'),(3008,2001,'CHC LOHANDIGUDA'),(3009,2001,'CHC MAKDI'),(3010,2001,'CHC PHARASGAON'),(3011,2001,'CHC TOKAPAL'),(3012,2001,'CHC VISHRAMPURI'),(3013,2002,'CHC BHAIRAMGARH'),(3014,2002,'CHC BHOPALPATTANAM (BLOCK PHC BHOPALPATTANAM)'),(3015,2002,'CHC GANGALOOR'),(3016,2002,'CHC USOOR'),(3017,2003,'CHC BILHA'),(3018,2003,'CHC GOURELLA'),(3019,2003,'CHC KOTA'),(3020,2003,'CHC LORMI'),(3021,2003,'CHC MARWAHI'),(3022,2003,'CHC MASTURI'),(3023,2003,'CHC MUNGELI'),(3024,2003,'CHC PATHARIYA'),(3025,2003,'CHC PENDRA'),(3026,2003,'CHC TAKHATPUR'),(3027,2004,'CHC GEEDAM'),(3028,2004,'CHC KATEKALYAN'),(3029,2004,'CHC KUAKONDA'),(3030,2019,'CHC SUKMA'),(3031,2019,'CHC CHHINDGARH'),(3032,2019,'CHC KONTA'),(3033,2005,'CHC JANJGIR'),(3034,2005,'CHC KURUD'),(3035,2005,'CHC NAGRI'),(3036,2005,'CHC MAGARLOD'),(3037,2006,'CHC UTAI'),(3038,2006,'CHC NIKUM'),(3039,2006,'CHC JHEET'),(3040,2006,'CHC PATAN'),(3041,2006,'CHC DHAMDHA'),(3042,2006,'BORI'),(3043,2006,'AHIRWARA'),(3044,2007,'CHC AKALTARA'),(3045,2007,'CHC BALODA'),(3046,2007,'CHC DHABRA'),(3047,2007,'CHC BAMHNIDIH'),(3048,2007,'CHC SAKTI'),(3049,2007,'CHC NAVAGARH'),(3050,2007,'CHC JAIJAIPUR'),(3051,2007,'CHC KHAROUD'),(3052,2007,'CHC PAMGADH'),(3053,2007,'CHC MALKHAROUDA'),(3054,2008,'CHC BAGICHA'),(3055,2008,'CHC DULDULA'),(3056,2008,'CHC KANSABEL'),(3057,2008,'CHC KUNKURI'),(3058,2008,'CHC LODAM'),(3059,2008,'CHC MANORA'),(3060,2008,'CHC PATHALGAON'),(3061,2008,'CHC PHARSABAHAR'),(3062,2016,'CHC ABHANPUR'),(3063,2016,'CHC ARANG'),(3064,2016,'CHC BALODA BAZAR'),(3065,2016,'CHC BHATAPARA'),(3066,2016,'CHC BHILAIGARH'),(3067,2016,'CHC CHURRA'),(3068,2016,'CHC DEWBHOG'),(3069,2016,'CHC DHARSIWA'),(3070,2016,'CHC FINGESHWAR'),(3071,2016,'CHC GARIYABAND'),(3072,2016,'CHC KASDOL'),(3073,2016,'CHC LAVAN'),(3074,2016,'CHC MAINPUR'),(3075,2016,'CHC NAWAPARA'),(3076,2016,'CHC PALARI'),(3077,2016,'CHC RAJIM'),(3078,2016,'CHC SIMGA'),(3079,2016,'CHC TILDA'),(3080,2001,'VISHRAMPURI1'),(3081,2001,'VISHRAMPURI1'),(3082,2001,'CHC DARBHA'),(3083,2001,'CHC DARBHA12');

/*Table structure for table `checkup_details` */

DROP TABLE IF EXISTS `checkup_details`;

CREATE TABLE `checkup_details` (
  `checkup_id` int(11) NOT NULL AUTO_INCREMENT,
  `anm_id` int(11) DEFAULT NULL,
  `pat_id` int(11) DEFAULT NULL,
  `date_of_checkup` date DEFAULT NULL,
  PRIMARY KEY (`checkup_id`),
  KEY `FK_checkup_details` (`anm_id`),
  CONSTRAINT `FK_checkup_details` FOREIGN KEY (`anm_id`) REFERENCES `anm` (`anm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `checkup_details` */

/*Table structure for table `diabetes` */

DROP TABLE IF EXISTS `diabetes`;

CREATE TABLE `diabetes` (
  `diabetes_id` int(11) NOT NULL AUTO_INCREMENT,
  `diabetes_test_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`diabetes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `diabetes` */

/*Table structure for table `diagnosis` */

DROP TABLE IF EXISTS `diagnosis`;

CREATE TABLE `diagnosis` (
  `dignosis_id` int(11) NOT NULL AUTO_INCREMENT,
  `pat_id` int(11) DEFAULT NULL,
  `hypertension_id` int(11) DEFAULT NULL,
  `diabetes_id` int(11) DEFAULT NULL,
  `cardiovascular_id` int(11) DEFAULT NULL,
  `cancer_id` int(11) DEFAULT NULL,
  `digno_date` date DEFAULT NULL,
  PRIMARY KEY (`dignosis_id`),
  KEY `FK_diagnosis_rf_disease` (`hypertension_id`),
  KEY `FK_diagnosis` (`pat_id`),
  KEY `FK_diagnosis_cancer` (`cancer_id`),
  KEY `FK_diagnosis_diabetes` (`diabetes_id`),
  KEY `FK_diagnosis_cardiovascular` (`cardiovascular_id`),
  CONSTRAINT `FK_diagnosis` FOREIGN KEY (`pat_id`) REFERENCES `patient_details` (`pat_id`),
  CONSTRAINT `FK_diagnosis_cancer` FOREIGN KEY (`cancer_id`) REFERENCES `cancer` (`cancer_id`),
  CONSTRAINT `FK_diagnosis_cardiovascular` FOREIGN KEY (`cardiovascular_id`) REFERENCES `cardiovascular` (`cardiovascular_id`),
  CONSTRAINT `FK_diagnosis_diabetes` FOREIGN KEY (`diabetes_id`) REFERENCES `diabetes` (`diabetes_id`),
  CONSTRAINT `FK_diagnosis_hyper` FOREIGN KEY (`hypertension_id`) REFERENCES `hypertension` (`hypertension_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `diagnosis` */

/*Table structure for table `diagnosisnew` */

DROP TABLE IF EXISTS `diagnosisnew`;

CREATE TABLE `diagnosisnew` (
  `diagnosis_id` int(11) NOT NULL AUTO_INCREMENT,
  `pat_id` int(11) DEFAULT NULL,
  `diabetic` tinyint(1) DEFAULT NULL,
  `hypertension` tinyint(1) DEFAULT NULL,
  `cardiovascular` tinyint(1) DEFAULT NULL,
  `cancer` tinyint(1) DEFAULT NULL,
  `homevisit` tinyint(1) DEFAULT NULL,
  `digno_date` date DEFAULT NULL,
  PRIMARY KEY (`diagnosis_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `diagnosisnew` */

insert  into `diagnosisnew`(`diagnosis_id`,`pat_id`,`diabetic`,`hypertension`,`cardiovascular`,`cancer`,`homevisit`,`digno_date`) values (6,39,1,1,1,NULL,NULL,'2013-03-19'),(7,42,1,NULL,NULL,NULL,NULL,'2013-01-21'),(8,43,1,NULL,1,1,1,'2013-01-21'),(9,40,NULL,NULL,NULL,1,1,'2013-01-21'),(10,41,NULL,1,NULL,NULL,1,'2013-02-21'),(11,38,1,NULL,1,1,NULL,'2013-02-21');

/*Table structure for table `disease` */

DROP TABLE IF EXISTS `disease`;

CREATE TABLE `disease` (
  `disease_id` int(11) NOT NULL AUTO_INCREMENT,
  `disease_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`disease_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `disease` */

/*Table structure for table `district` */

DROP TABLE IF EXISTS `district`;

CREATE TABLE `district` (
  `district_id` int(11) NOT NULL AUTO_INCREMENT,
  `state_id` int(11) DEFAULT NULL,
  `district_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`district_id`),
  KEY `FK_district_rf_state` (`state_id`),
  CONSTRAINT `FK_district_rf_state` FOREIGN KEY (`state_id`) REFERENCES `state` (`state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2020 DEFAULT CHARSET=latin1;

/*Data for the table `district` */

insert  into `district`(`district_id`,`state_id`,`district_name`) values (2001,1001,'BASTAR(JAGDALPUR)'),(2002,1001,'BIJAPUR'),(2003,1001,'BILASPUR1'),(2004,1001,'DANTEWADA'),(2005,1001,'DHAMTARI'),(2006,1001,'DURG'),(2007,1001,'JANJGIR(CHAMPA)'),(2008,1001,'JASHPUR'),(2009,1001,'KANKER'),(2010,1001,'KAWARDHA'),(2011,1001,'KORBA'),(2012,1001,'KORIA'),(2013,1001,'MAHASAMUND'),(2014,1001,'NARAYANPUR'),(2015,1001,'RAIGARH'),(2016,1001,'RAIPUR'),(2017,1001,'RAJNANDGAON'),(2018,1001,'SURGUJA(AMBIKAPUR)'),(2019,1001,'SUKMA');

/*Table structure for table `hypertension` */

DROP TABLE IF EXISTS `hypertension`;

CREATE TABLE `hypertension` (
  `hypertension_id` int(11) NOT NULL AUTO_INCREMENT,
  `hypertension_max` int(11) DEFAULT NULL,
  `hypertension_min` int(11) DEFAULT NULL,
  PRIMARY KEY (`hypertension_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hypertension` */

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `loginid` int(11) NOT NULL AUTO_INCREMENT,
  `level` int(11) DEFAULT NULL,
  `userid` varchar(100) DEFAULT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`loginid`),
  UNIQUE KEY `level` (`level`,`password`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`loginid`,`level`,`userid`,`password`) values (1,1,'admin','admin'),(2,2,'district','dis'),(3,3,'chc','chc'),(4,4,'phc','phc'),(5,5,'shc','shc'),(7,4,'phc','phc1');

/*Table structure for table `patient_details` */

DROP TABLE IF EXISTS `patient_details`;

CREATE TABLE `patient_details` (
  `pat_id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_id` int(11) DEFAULT NULL,
  `pat_name` varchar(200) DEFAULT NULL,
  `father_name` varchar(200) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `village` varchar(200) DEFAULT NULL,
  `camp_regno` varchar(200) DEFAULT NULL,
  `pat_address` varchar(200) DEFAULT NULL,
  `contact` varchar(200) DEFAULT NULL,
  `id_type` varchar(200) DEFAULT NULL,
  `id_no` varchar(200) DEFAULT NULL,
  `smoking` tinyint(1) DEFAULT NULL,
  `chewable` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`pat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=latin1;

/*Data for the table `patient_details` */

insert  into `patient_details`(`pat_id`,`sub_id`,`pat_name`,`father_name`,`age`,`sex`,`village`,`camp_regno`,`pat_address`,`contact`,`id_type`,`id_no`,`smoking`,`chewable`) values (37,5001,'akash','sharma',34,'Female','bill','111111111','nakapara','1745665236',NULL,'111111',1,1),(38,5001,'vijay','vikramm',35,'Female','bill','1111111','Vijay Vajpayee colony','3333333333',NULL,'22222222',0,0),(39,5002,'dev','fsadf',54,'Male','gate','55555','vile','55555',NULL,'44444444',0,1),(40,2002,'sdg','sdg',23,'Female','sdf','23','234','232','Rashan Card','2324',0,1),(41,5001,'asfa','asdf',234,'Female','2342','324','234','234','Rashan Card','3423',0,1),(42,2003,'ram','rajesh',45,'Male','billha','3434','sdfds','65567676','Passport','123456789',0,1),(43,2002,'ram3','dev',343,'Female','sdg','4343','3434','3434','Passport','3434',0,1),(44,2003,'1233','123123',123123,'Female','123123','123','12313','12345678','Rashan Card','1231',0,1),(45,2005,'11111','111111111',1111111111,'Female','111111','111111111','1111111111','1111111111','Passport','111111111',0,1),(46,2003,'raj','ara',23,'Male','w','123','dag','232','Rashan Card','212',0,1),(47,2003,'123','123123',1321,'Female','123','132','12313','123','Passport','123456789',0,1);

/*Table structure for table `phc` */

DROP TABLE IF EXISTS `phc`;

CREATE TABLE `phc` (
  `phc_id` int(11) NOT NULL AUTO_INCREMENT,
  `chc_id` int(11) DEFAULT NULL,
  `phc_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`phc_id`),
  KEY `FK_phc_rf_chc` (`chc_id`),
  CONSTRAINT `FK_phc_rf_chc` FOREIGN KEY (`chc_id`) REFERENCES `chc` (`chc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4171 DEFAULT CHARSET=latin1;

/*Data for the table `phc` */

insert  into `phc`(`phc_id`,`chc_id`,`phc_name`) values (4001,3017,'PHC BALTORI'),(4002,3017,'PHC BELTARA'),(4003,3017,'PHC BODSARA'),(4004,3017,'PHC CHAKARBHATA'),(4005,3017,'PHC DAGORI'),(4006,3017,'PHC DEVRIKHURDA'),(4007,3017,'PHC HARDIKALA'),(4008,3017,'PHC KADAR'),(4009,3017,'PHC LINGIYADIH'),(4010,3018,'PHC BASTI'),(4011,3018,'PHC FRU SENETORIUM'),(4012,3018,'PHC KEONCHI'),(4013,3018,'PHC KHODRI'),(4014,3018,'PHC SADHWANI'),(4015,3019,'PHC AAMAGOHAN'),(4016,3019,'PHC BELGAHNA'),(4017,3019,'PHC CHAPORA'),(4018,3019,'PHC KARGIKALA'),(4019,3019,'PHC KENDA'),(4020,3019,'PHC NAVAGAON (SALKA)'),(4021,3019,'PHC PONDI'),(4022,3019,'PHC RATANPUR'),(4023,3019,'PHC SHIVTARAI'),(4024,3019,'PHC TEGANMADA'),(4025,3020,'PHC BENGAKAPA'),(4026,3020,'PHC CHANDELI'),(4027,3020,'PHC DEVARHAT'),(4028,3020,'PHC KHAIRWAR KHURD'),(4029,3020,'PHC KHAPRI'),(4030,3020,'PHC KHUDIYA'),(4031,3020,'PHC RAMHEPUR'),(4032,3020,'PHC SALHEGHORI'),(4033,3020,'PHC SEMARSAL'),(4034,3021,'PHC BHARRIDAND'),(4035,3021,'PHC DANIKUNDI'),(4036,3021,'PHC DOBHAR'),(4037,3021,'PHC SEMARDARRI'),(4038,3021,'PHC SIWNI'),(4039,3022,'PHC DARRIGHAT'),(4040,3022,'PHC JAIRAMNAGAR'),(4041,3022,'PHC JONDHARA'),(4042,3022,'PHC KHONDHARA'),(4043,3022,'PHC KUKURDIKALA'),(4044,3022,'PHC LOHARSI'),(4045,3022,'PHC MALHAR'),(4046,3022,'PHC NAWAGAON'),(4047,3022,'PHC OKHAR'),(4048,3022,'PHC PACHPEDI'),(4049,3022,'PHC SEEPAT'),(4050,3023,'PHC BARELA'),(4051,3023,'PHC DASHRANGPUR'),(4052,3023,'PHC JARHAGAUN'),(4053,3023,'PHC KHAMHARIYA1'),(4054,3023,'PHC NAVAGAUN CHINU'),(4055,3023,'PHC PADAMPUR'),(4056,3023,'PHC PAL'),(4057,3023,'PHC SETGANGA'),(4058,3024,'PHC BHATGAON'),(4059,3024,'PHC JAGTAKAPA'),(4060,3024,'PHC RAMBODE'),(4061,3024,'PHC SARGAON'),(4062,3025,'PHC AMADAND'),(4063,3025,'PHC AMADIKHURD'),(4064,3025,'PHC KODGAR'),(4065,3025,'PHC KOTMI'),(4066,3025,'PHC NAWAGANW'),(4067,3026,'PHC AMSENA'),(4068,3026,'PHC BELPAN'),(4069,3026,'PHC DAIJJA'),(4070,3026,'PHC GANIYARI'),(4071,3026,'PHC JARONDHA'),(4072,3026,'PHC JUNAPARA'),(4073,3026,'PHC MOCHHA'),(4074,3026,'PHC PALI'),(4075,3026,'PHC SAGAR'),(4076,3062,'PHC CHAMPARAN'),(4077,3062,'PHC KHILORA'),(4078,3062,'PHC KHORPA'),(4079,3062,'PHC MANIKCHAURI'),(4080,3062,'PHC TORLA'),(4081,3062,'PHC UPARWARA'),(4082,3063,'PHC BHANSOJ'),(4083,3063,'PHC CHANDKURI'),(4084,3063,'PHC KURUD KUTELA'),(4085,3063,'PHC MANDIR HASAUD'),(4086,3063,'PHC PHARFAUD'),(4087,3063,'PHC REWA'),(4088,3065,'PHC BITKULI'),(4089,3065,'PHC MOPAR'),(4090,3065,'PHC MOPKA'),(4091,3065,'PHC NIPANIA'),(4092,3066,'PHC BHATAGAON'),(4093,3066,'PHC DHANSIR'),(4094,3066,'PHC GOPALPUR'),(4095,3066,'PHC PAWNI'),(4096,3066,'PHC SARSIWA'),(4097,3067,'PHC PANDUKA'),(4098,3067,'PHC PATSIWNI'),(4099,3067,'PHC RASELA'),(4100,3068,'PHC DIWANMUDA'),(4101,3068,'PHC JHAKARPARA'),(4102,3069,'PHC AAMSIWNI'),(4103,3069,'PHC BHATGAON'),(4104,3069,'PHC BIRGAON'),(4105,3069,'PHC BORIAKALA'),(4106,3069,'PHC DANDEKALA'),(4107,3069,'PHC LABHANDI'),(4108,3069,'PHC MADHAR'),(4109,3069,'PHC SILYARI'),(4110,3069,'PHC URLA'),(4111,3070,'PHC KONDKERA'),(4112,3071,'PHC KOCHVAY'),(4113,3071,'PHC-PIPERCHEDI'),(4114,3072,'PHC BAR NAWAPARA'),(4115,3072,'PHC BARPALI'),(4116,3072,'PHC KATGI'),(4117,3072,'PHC RAJADEVRI'),(4118,3072,'PHC SONKHAN'),(4119,3073,'PHC ARJUNI'),(4120,3073,'PHC-LAHOD'),(4121,3073,'PHC-RISDA'),(4122,3074,'PHC AMLIPADAR'),(4123,3074,'PHC JHARGAON'),(4124,3074,'PHC URMAL'),(4125,3076,'PHC AUDAN'),(4126,3076,'PHC GIDPURI'),(4127,3076,'PHC JARWE'),(4128,3076,'PHC KOSMANDI'),(4129,3076,'PHC LACHANPUR'),(4130,3076,'PHC ROHASI'),(4131,3077,'PHC KOPRA'),(4132,3078,'PHC DOMAKHEDA'),(4133,3078,'PHC HATBAND'),(4134,3078,'PHC ROHRA'),(4135,3078,'PHC SUHELA'),(4136,3079,'PHC BANGOLI'),(4137,3079,'PHC KHAIRKHUT'),(4138,3079,'PHC KHARORA'),(4139,3054,'PHC CHAMPA'),(4140,3054,'PHC CHICHILI'),(4141,3054,'PHC JHIKKI'),(4142,3054,'PHC KALIA'),(4143,3054,'PHC KURROG'),(4144,3054,'PHC MAINI'),(4145,3054,'PHC PANDRAPATH'),(4146,3054,'PHC SANNA'),(4147,3054,'PHC SULESA'),(4148,3055,'PHC KASTURA'),(4149,3056,'PHC BAGIA'),(4150,3056,'PHC DOKDA'),(4151,3057,'PHC NARAYANPUR'),(4152,3057,'PHC RANPUR'),(4153,3058,'PHC ARRA'),(4154,3058,'PHC GHOLENG'),(4155,3058,'PHC PAIKU'),(4156,3059,'PHC ASTHA'),(4157,3059,'PHC GHAGHRA'),(4158,3059,'PHC SONKYARI'),(4159,3060,'PHC BAGBAHAR'),(4160,3060,'PHC KILKILA'),(4161,3060,'PHC KOTBA'),(4162,3060,'PHC KUKERGAON'),(4163,3060,'PHC LUDEG'),(4164,3060,'PHC SHEKHARPUR'),(4165,3060,'PHC SURUNGPANI'),(4166,3060,'PHC TAMTA'),(4167,3061,'PHC BHAGORA'),(4168,3061,'PHC BHELWAN'),(4169,3061,'PHC KERSAI'),(4170,3061,'PHC TAPKARA');

/*Table structure for table `referal` */

DROP TABLE IF EXISTS `referal`;

CREATE TABLE `referal` (
  `reference_id` int(11) NOT NULL AUTO_INCREMENT,
  `pat_id` int(11) DEFAULT NULL,
  `reference_from` varchar(200) DEFAULT NULL,
  `reference_to` varchar(200) DEFAULT NULL,
  `date_to_refers` date DEFAULT NULL,
  PRIMARY KEY (`reference_id`),
  KEY `FK_referal_rf_pd` (`pat_id`),
  CONSTRAINT `FK_referal_rf_pd` FOREIGN KEY (`pat_id`) REFERENCES `patient_details` (`pat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

/*Data for the table `referal` */

insert  into `referal`(`reference_id`,`pat_id`,`reference_from`,`reference_to`,`date_to_refers`) values (10,38,'5001','3017','2013-03-16'),(11,39,'5002','2013','2013-03-16'),(12,39,'2003','2019','2013-03-19'),(13,37,'2002','2017','2013-03-19'),(14,44,'2003','2019','2013-03-19'),(15,41,'2003','2017','2013-03-19'),(16,37,'2004','2017','2013-03-19'),(17,39,'2004','2019','2013-03-19'),(18,42,'2004','2017','2013-03-19');

/*Table structure for table `screening_details` */

DROP TABLE IF EXISTS `screening_details`;

CREATE TABLE `screening_details` (
  `screen_id` int(11) NOT NULL AUTO_INCREMENT,
  `pat_id` int(11) DEFAULT NULL,
  `diabetes_test_type` varchar(50) DEFAULT NULL,
  `diabetes` decimal(10,0) DEFAULT NULL,
  `hypertension_high` decimal(10,0) DEFAULT NULL,
  `hypertension_low` decimal(10,0) DEFAULT NULL,
  `cardiovascular` tinyint(1) DEFAULT NULL,
  `cancer` tinyint(1) DEFAULT NULL,
  `date1` date DEFAULT NULL,
  PRIMARY KEY (`screen_id`),
  KEY `FK_screening_details` (`pat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

/*Data for the table `screening_details` */

insert  into `screening_details`(`screen_id`,`pat_id`,`diabetes_test_type`,`diabetes`,`hypertension_high`,`hypertension_low`,`cardiovascular`,`cancer`,`date1`) values (16,37,'PP','140','3212','123',1,1,'2013-03-16'),(17,39,'Random','0','145','78',1,1,'2013-03-16'),(18,38,'FP','345','0','54',1,0,'2013-03-15');

/*Table structure for table `shc` */

DROP TABLE IF EXISTS `shc`;

CREATE TABLE `shc` (
  `sub_id` int(11) NOT NULL AUTO_INCREMENT,
  `chc_id` int(11) DEFAULT NULL,
  `phc_id` int(11) DEFAULT NULL,
  `sub_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`sub_id`),
  KEY `FK_shc_rf_chc` (`chc_id`),
  KEY `FK_shc_rf_phc` (`phc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5039 DEFAULT CHARSET=latin1;

/*Data for the table `shc` */

insert  into `shc`(`sub_id`,`chc_id`,`phc_id`,`sub_name`) values (5001,3017,4001,'SHC BARTORI'),(5002,3017,4001,'SHC HATHNI'),(5003,3017,4001,'SHC KOHRAUDA'),(5004,3017,4001,'SHC MURKUTA'),(5005,3017,4002,'SHC AKALTARI'),(5006,3017,4002,'SHC BASAHA'),(5007,3017,4002,'SHC BELTARA'),(5008,3017,4002,'SHC BHADI'),(5009,3017,4002,'SHC BHATGAON'),(5010,3017,4002,'SHC DEVKIRARI'),(5011,3017,4002,'SHC DHOURABHATA'),(5012,3017,4002,'SHC GADHAWAT'),(5013,3017,4002,'SHC HIRRY'),(5014,3017,4002,'SHC KHAIRA'),(5015,3017,4002,'SHC KONI'),(5016,3017,4002,'SHC LAKHRAM'),(5017,3017,4002,'SHC LIMHA'),(5018,3017,4002,'SHC LOPHANDI'),(5019,3017,4002,'SHC MADANPUR'),(5020,3017,4002,'SHC PEDARWA'),(5021,3017,4002,'SHC POUSARA'),(5022,3017,4002,'SHC RAHANGI'),(5023,3017,4002,'SHC SALKHA'),(5024,3017,4002,'SHC SELAR'),(5025,3017,4002,'SHC SEMARTAL'),(5026,3017,4002,'SHC SENDRI'),(5027,3017,4002,'SHC TAKER'),(5028,3017,4003,'SHC BODSARA'),(5029,3017,4003,'SHC BUNDELA'),(5030,3017,4003,'SHC SARDHA'),(5031,3017,4004,'SHC BHATAPARA'),(5032,3017,4004,'SHC BODRI'),(5033,3017,4004,'SHC NAGPURA'),(5034,3017,4004,'SHC NAYAPARA'),(5035,3017,4004,'SHC TIFRA'),(5036,3017,4005,'SHC DAGORI'),(5037,3017,4005,'SHC POUSARY'),(5038,3017,4005,'SHC TALAGAON');

/*Table structure for table `state` */

DROP TABLE IF EXISTS `state`;

CREATE TABLE `state` (
  `state_id` int(11) NOT NULL AUTO_INCREMENT,
  `state_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=latin1;

/*Data for the table `state` */

insert  into `state`(`state_id`,`state_name`) values (1001,'CHHATTISGARH'),(1002,'BIHAR'),(1003,'MADHYA PRADESH'),(1008,'great');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
