package com.example.rerecyclerview.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonResponse {

    public class ClinicsInfo {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("doctor_id")
        @Expose
        private Integer doctorId;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("clinic_page")
        @Expose
        private Integer clinicPage;
        @SerializedName("logo")
        @Expose
        private String logo;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("examination_fees")
        @Expose
        private Integer examinationFees;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("zip_code")
        @Expose
        private Object zipCode;
        @SerializedName("website")
        @Expose
        private Object website;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("specialities")
        @Expose
        private Object specialities;
        @SerializedName("schedule_table")
        @Expose
        private Integer scheduleTable;
        @SerializedName("terms_and_conditions_mashfa_card")
        @Expose
        private Integer termsAndConditionsMashfaCard;
        @SerializedName("mashfacard_request")
        @Expose
        private Integer mashfacardRequest;
        @SerializedName("verified_mashfacard")
        @Expose
        private Integer verifiedMashfacard;
        @SerializedName("notes_mashfacard")
        @Expose
        private String notesMashfacard;
        @SerializedName("rating")
        @Expose
        private Integer rating;
        @SerializedName("image_path")
        @Expose
        private String imagePath;
        @SerializedName("map_location")
        @Expose
        private String mapLocation;
        @SerializedName("working_hours")
        @Expose
        private String workingHours;
        @SerializedName("created_at")
        @Expose
        private Object createdAt;
        @SerializedName("updated_at")
        @Expose
        private Object updatedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getDoctorId() {
            return doctorId;
        }

        public void setDoctorId(Integer doctorId) {
            this.doctorId = doctorId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getClinicPage() {
            return clinicPage;
        }

        public void setClinicPage(Integer clinicPage) {
            this.clinicPage = clinicPage;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public Integer getExaminationFees() {
            return examinationFees;
        }

        public void setExaminationFees(Integer examinationFees) {
            this.examinationFees = examinationFees;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Object getZipCode() {
            return zipCode;
        }

        public void setZipCode(Object zipCode) {
            this.zipCode = zipCode;
        }

        public Object getWebsite() {
            return website;
        }

        public void setWebsite(Object website) {
            this.website = website;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Object getSpecialities() {
            return specialities;
        }

        public void setSpecialities(Object specialities) {
            this.specialities = specialities;
        }

        public Integer getScheduleTable() {
            return scheduleTable;
        }

        public void setScheduleTable(Integer scheduleTable) {
            this.scheduleTable = scheduleTable;
        }

        public Integer getTermsAndConditionsMashfaCard() {
            return termsAndConditionsMashfaCard;
        }

        public void setTermsAndConditionsMashfaCard(Integer termsAndConditionsMashfaCard) {
            this.termsAndConditionsMashfaCard = termsAndConditionsMashfaCard;
        }

        public Integer getMashfacardRequest() {
            return mashfacardRequest;
        }

        public void setMashfacardRequest(Integer mashfacardRequest) {
            this.mashfacardRequest = mashfacardRequest;
        }

        public Integer getVerifiedMashfacard() {
            return verifiedMashfacard;
        }

        public void setVerifiedMashfacard(Integer verifiedMashfacard) {
            this.verifiedMashfacard = verifiedMashfacard;
        }

        public String getNotesMashfacard() {
            return notesMashfacard;
        }

        public void setNotesMashfacard(String notesMashfacard) {
            this.notesMashfacard = notesMashfacard;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public String getMapLocation() {
            return mapLocation;
        }

        public void setMapLocation(String mapLocation) {
            this.mapLocation = mapLocation;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public Object getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Object createdAt) {
            this.createdAt = createdAt;
        }

        public Object getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Object updatedAt) {
            this.updatedAt = updatedAt;
        }

    }


    public static class Data {

        @SerializedName("clinics info")
        @Expose
        private List<ClinicsInfo> clinicsInfo = null;
        @SerializedName("services")
        @Expose
        private List<Service> services = null;
        @SerializedName("offers and masfa card")
        @Expose
        private String offersAndMasfaCard;
        @SerializedName("medical_treatments")
        @Expose
        private List<MedicalTreatment> medicalTreatments = null;
        @SerializedName("specialization")
        @Expose
        private String specialization;
        @SerializedName("biography")
        @Expose
        private String biography;
        @SerializedName("speciality")
        @Expose
        private String speciality;
        @SerializedName("work_experience")
        @Expose
        private String workExperience;
        @SerializedName("speaks")
        @Expose
        private String speaks;
        @SerializedName("education")
        @Expose
        private String education;
        @SerializedName("registrations")
        @Expose
        private String registrations;
        @SerializedName("research and publication")
        @Expose
        private String researchAndPublication;
        @SerializedName("Professional Memberships")
        @Expose
        private String professionalMemberships;
        @SerializedName("awards")
        @Expose
        private String awards;
        @SerializedName("feed_back")
        @Expose
        private List<FeedBack> feedBack = null;

        public List<ClinicsInfo> getClinicsInfo() {
            return clinicsInfo;
        }

        public void setClinicsInfo(List<ClinicsInfo> clinicsInfo) {
            this.clinicsInfo = clinicsInfo;
        }

        public List<Service> getServices() {
            return services;
        }

        public void setServices(List<Service> services) {
            this.services = services;
        }

        public String getOffersAndMasfaCard() {
            return offersAndMasfaCard;
        }

        public void setOffersAndMasfaCard(String offersAndMasfaCard) {
            this.offersAndMasfaCard = offersAndMasfaCard;
        }

        public List<MedicalTreatment> getMedicalTreatments() {
            return medicalTreatments;
        }

        public void setMedicalTreatments(List<MedicalTreatment> medicalTreatments) {
            this.medicalTreatments = medicalTreatments;
        }

        public String getSpecialization() {
            return specialization;
        }

        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }

        public String getBiography() {
            return biography;
        }

        public void setBiography(String biography) {
            this.biography = biography;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        public String getWorkExperience() {
            return workExperience;
        }

        public void setWorkExperience(String workExperience) {
            this.workExperience = workExperience;
        }

        public String getSpeaks() {
            return speaks;
        }

        public void setSpeaks(String speaks) {
            this.speaks = speaks;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public String getRegistrations() {
            return registrations;
        }

        public void setRegistrations(String registrations) {
            this.registrations = registrations;
        }

        public String getResearchAndPublication() {
            return researchAndPublication;
        }

        public void setResearchAndPublication(String researchAndPublication) {
            this.researchAndPublication = researchAndPublication;
        }

        public String getProfessionalMemberships() {
            return professionalMemberships;
        }

        public void setProfessionalMemberships(String professionalMemberships) {
            this.professionalMemberships = professionalMemberships;
        }

        public String getAwards() {
            return awards;
        }

        public void setAwards(String awards) {
            this.awards = awards;
        }

        public List<FeedBack> getFeedBack() {
            return feedBack;
        }

        public void setFeedBack(List<FeedBack> feedBack) {
            this.feedBack = feedBack;
        }

    }


    public static class Content {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("data")
        @Expose
        private Data data;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }
    }


    public static class FeedBack {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("doctor_id")
        @Expose
        private Integer doctorId;
        @SerializedName("user_id")
        @Expose
        private Integer userId;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("verified")
        @Expose
        private Integer verified;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public FeedBack(Integer id, Integer doctorId, Integer userId, String username, Integer verified, String description, String createdAt, String updatedAt) {
            this.id = id;
            this.doctorId = doctorId;
            this.userId = userId;
            this.username = username;
            this.verified = verified;
            this.description = description;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getDoctorId() {
            return doctorId;
        }

        public void setDoctorId(Integer doctorId) {
            this.doctorId = doctorId;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Integer getVerified() {
            return verified;
        }

        public void setVerified(Integer verified) {
            this.verified = verified;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }


    public class MedicalTreatment {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("image_path")
        @Expose
        private String imagePath;
        @SerializedName("description_text")
        @Expose
        private String descriptionText;
        @SerializedName("doctor_id")
        @Expose
        private String doctorId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public String getDescriptionText() {
            return descriptionText;
        }

        public void setDescriptionText(String descriptionText) {
            this.descriptionText = descriptionText;
        }

        public String getDoctorId() {
            return doctorId;
        }

        public void setDoctorId(String doctorId) {
            this.doctorId = doctorId;
        }

    }

    public class Service {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("imagepath")
        @Expose
        private String imagepath;
        @SerializedName("servicename")
        @Expose
        private String servicename;
        @SerializedName("serviceprice")
        @Expose
        private String serviceprice;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getImagepath() {
            return imagepath;
        }

        public void setImagepath(String imagepath) {
            this.imagepath = imagepath;
        }

        public String getServicename() {
            return servicename;
        }

        public void setServicename(String servicename) {
            this.servicename = servicename;
        }

        public String getServiceprice() {
            return serviceprice;
        }

        public void setServiceprice(String serviceprice) {
            this.serviceprice = serviceprice;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }

}
