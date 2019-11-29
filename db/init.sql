CREATE TABLE `todo`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `date_created` datetime(0) NOT NULL,
  `last_updated` datetime(0) NOT NULL,
  `title` varchar(255) NOT NULL,
  `note` varchar(255) NULL,
  PRIMARY KEY (`id`)
);