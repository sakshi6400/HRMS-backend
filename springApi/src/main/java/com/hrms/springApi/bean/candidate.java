package com.hrms.springApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="candidate_master")
	public class candidate extends Auditable{

		 @GeneratedValue(strategy= GenerationType.AUTO)	 
			@Id
		private long Candidate_Id;
		private String Name;
		private String Resume;
		
		private String Email_Id;
		 
		 			
		public candidate() {
			 
		}

		public candidate(long candidate_Id, String name, String resume, String email_Id) {
			super();
			Candidate_Id = candidate_Id;
			Name = name;
			Resume = resume;
			Email_Id = email_Id;
		}

		public long getCandidate_Id() {
			return Candidate_Id;
		}

		public void setCandidate_Id(long candidate_Id) {
			Candidate_Id = candidate_Id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getResume() {
			return Resume;
		}

		public void setResume(String resume) {
			Resume = resume;
		}

		public String getEmail_Id() {
			return Email_Id;
		}

		public void setEmail_Id(String email_Id) {
			Email_Id = email_Id;
		}

		@Override
		public String toString() {
			return "candidate [Candidate_Id=" + Candidate_Id + ", Name=" + Name + ", Resume=" + Resume + ", Email_Id="
					+ Email_Id + "]";
		}

		 
		
}
