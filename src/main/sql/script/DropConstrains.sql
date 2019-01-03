/*FOREIGN KEYS*/
ALTER TABLE IF EXISTS "State" DROP CONSTRAINT IF EXISTS "StateCountryFK" CASCADE;

ALTER TABLE IF EXISTS "City" DROP CONSTRAINT IF EXISTS "CityStateFK" CASCADE;

ALTER TABLE IF EXISTS "Address" DROP CONSTRAINT IF EXISTS "AddressCityFK" CASCADE;

ALTER TABLE IF EXISTS "Subject" DROP CONSTRAINT IF EXISTS "SubjectAddressFK" CASCADE;

ALTER TABLE IF EXISTS "SubjectSubject" DROP CONSTRAINT IF EXISTS "SubjectSubjectParentFK" CASCADE;
ALTER TABLE IF EXISTS "SubjectSubject" DROP CONSTRAINT IF EXISTS "SubjectSubjectChildFK" CASCADE;
ALTER TABLE IF EXISTS "SubjectSubject" DROP CONSTRAINT IF EXISTS "SubjectSubjectAddressFK" CASCADE;

ALTER TABLE IF EXISTS "Individual" DROP CONSTRAINT IF EXISTS "IndividualSubjectFK" CASCADE;

ALTER TABLE IF EXISTS "Organization" DROP CONSTRAINT IF EXISTS "OrganizationSubjectFK" CASCADE;

ALTER TABLE IF EXISTS "Company" DROP CONSTRAINT IF EXISTS "CompanyOrganizationFK" CASCADE;

ALTER TABLE IF EXISTS "User" DROP CONSTRAINT IF EXISTS "UserIndividualFK" CASCADE;

ALTER TABLE IF EXISTS "Token" DROP CONSTRAINT IF EXISTS "TokenCompanyFK" CASCADE;
ALTER TABLE IF EXISTS "Token" DROP CONSTRAINT IF EXISTS "TokenSubjectSubjectFK" CASCADE;

ALTER TABLE IF EXISTS "Catalog" DROP CONSTRAINT IF EXISTS "CatalogCompanyFK" CASCADE;

ALTER TABLE IF EXISTS "MeasureUnitMeasureUnit" DROP CONSTRAINT IF EXISTS "MeasureUnitFromFK" CASCADE;
ALTER TABLE IF EXISTS "MeasureUnitMeasureUnit" DROP CONSTRAINT IF EXISTS "MeasureUnitToFK" CASCADE;

ALTER TABLE IF EXISTS "Progeny" DROP CONSTRAINT IF EXISTS "ProgenyCompanyFK" CASCADE;

ALTER TABLE IF EXISTS "Service" DROP CONSTRAINT IF EXISTS "ServiceProgenyFK" CASCADE;
ALTER TABLE IF EXISTS "Service" DROP CONSTRAINT IF EXISTS "ServiceCatalogFK" CASCADE;
ALTER TABLE IF EXISTS "Service" DROP CONSTRAINT IF EXISTS "ServiceMeasureUnitFK" CASCADE;

ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductProgenyFK" CASCADE;
ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductWidthUnitFK" CASCADE;
ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductHeightUnitFK" CASCADE;
ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductLengthUnitFK" CASCADE;
ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductContentUnitFK" CASCADE;
ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductGrossWeightUnitFK" CASCADE;
ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductNetWeightUnitFK" CASCADE;

ALTER TABLE IF EXISTS "ProductProduct" DROP CONSTRAINT IF EXISTS "ProductProductProductFK" CASCADE;
ALTER TABLE IF EXISTS "ProductProduct" DROP CONSTRAINT IF EXISTS "ProductProductPartFK" CASCADE;

ALTER TABLE IF EXISTS "Merchandise" DROP CONSTRAINT IF EXISTS "MerchandiseProductFK" CASCADE;
ALTER TABLE IF EXISTS "Merchandise" DROP CONSTRAINT IF EXISTS "MerchandiseCatalogFK" CASCADE;
ALTER TABLE IF EXISTS "Merchandise" DROP CONSTRAINT IF EXISTS "MerchandiseMeasureUnitFK" CASCADE;

ALTER TABLE IF EXISTS "CompanyDevice" DROP CONSTRAINT IF EXISTS "CompanyDeviceCompanyFK" CASCADE;
ALTER TABLE IF EXISTS "CompanyDevice" DROP CONSTRAINT IF EXISTS "CompanyDeviceDeviceFK" CASCADE;

ALTER TABLE IF EXISTS "CompanyReceiptMethod" DROP CONSTRAINT IF EXISTS "CompanyReceiptMethodCompanyFK" CASCADE;
ALTER TABLE IF EXISTS "CompanyReceiptMethod" DROP CONSTRAINT IF EXISTS "CompanyReceiptMethodReceiptMethodFK" CASCADE;

ALTER TABLE IF EXISTS "CompanyPaymentMethod" DROP CONSTRAINT IF EXISTS "CompanyPaymentMethodCompanyFK" CASCADE;
ALTER TABLE IF EXISTS "CompanyPaymentMethod" DROP CONSTRAINT IF EXISTS "CompanyPaymentMethodPaymentMethodFK" CASCADE;

/*PRIMARY KEYS*/
ALTER TABLE IF EXISTS "Country" DROP CONSTRAINT IF EXISTS "CountryPK" CASCADE;

ALTER TABLE IF EXISTS "State" DROP CONSTRAINT IF EXISTS "StatePK" CASCADE;

ALTER TABLE IF EXISTS "City" DROP CONSTRAINT IF EXISTS "CityPK" CASCADE;

ALTER TABLE IF EXISTS "Address" DROP CONSTRAINT IF EXISTS "AddressPK" CASCADE;

ALTER TABLE IF EXISTS "Subject" DROP CONSTRAINT IF EXISTS "SubjectPK" CASCADE;

ALTER TABLE IF EXISTS "SubjectSubject" DROP CONSTRAINT IF EXISTS "SubjectSubjectPK" CASCADE;

ALTER TABLE IF EXISTS "Individual" DROP CONSTRAINT IF EXISTS "IndividualPK" CASCADE;

ALTER TABLE IF EXISTS "Organization" DROP CONSTRAINT IF EXISTS "OrganizationPK" CASCADE;

ALTER TABLE IF EXISTS "Company" DROP CONSTRAINT IF EXISTS "CompanyPK" CASCADE;

ALTER TABLE IF EXISTS "User" DROP CONSTRAINT IF EXISTS "UserPK" CASCADE;

ALTER TABLE IF EXISTS "Token" DROP CONSTRAINT IF EXISTS "TokenPK" CASCADE;

ALTER TABLE IF EXISTS "Catalog" DROP CONSTRAINT IF EXISTS "CatalogPK" CASCADE;

ALTER TABLE IF EXISTS "MeasureUnit" DROP CONSTRAINT IF EXISTS "MeasureUnitPK" CASCADE;

ALTER TABLE IF EXISTS "MeasureUnitMeasureUnit" DROP CONSTRAINT IF EXISTS "MeasureUnitMeasureUnitPK" CASCADE;

ALTER TABLE IF EXISTS "Progeny" DROP CONSTRAINT IF EXISTS "ProgenyPK" CASCADE;

ALTER TABLE IF EXISTS "Service" DROP CONSTRAINT IF EXISTS "ServicePK" CASCADE;

ALTER TABLE IF EXISTS "Product" DROP CONSTRAINT IF EXISTS "ProductPK" CASCADE;

ALTER TABLE IF EXISTS "ProductProduct" DROP CONSTRAINT IF EXISTS "ProductProductPK" CASCADE;

ALTER TABLE IF EXISTS "Merchandise" DROP CONSTRAINT IF EXISTS "MerchandisePK" CASCADE;

ALTER TABLE IF EXISTS "Device" DROP CONSTRAINT IF EXISTS "DevicePK" CASCADE; 

ALTER TABLE IF EXISTS "CompanyDevice" DROP CONSTRAINT IF EXISTS "CompanyDevicePK" CASCADE;

ALTER TABLE IF EXISTS "ReceiptMethod" DROP CONSTRAINT IF EXISTS "ReceiptMethodPK" CASCADE;

ALTER TABLE IF EXISTS "PaymentMethod" DROP CONSTRAINT IF EXISTS "PaymentMethodPK" CASCADE;

ALTER TABLE IF EXISTS "CompanyReceiptMethod" DROP CONSTRAINT IF EXISTS "CompanyReceiptMethodPK" CASCADE;

ALTER TABLE IF EXISTS "CompanyPaymentMethod" DROP CONSTRAINT IF EXISTS "CompanyPaymentMethodPK" CASCADE;
