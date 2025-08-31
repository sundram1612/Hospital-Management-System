INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
    ('Aarav Sharma', 'Male', '1990-05-10', 'aarav.sharma@example.com', 'O_POSITIVE'),
    ('Isha Verma', 'Female', '1992-08-21', 'isha.verma@example.com', 'A_POSITIVE'),
    ('Rohan Sharma', 'Male', '1988-11-15', 'rohan.sharma@example.com', 'B_POSITIVE'),
    ('Priya Prasad', 'Female', '2003-08-03', 'priya.prasad@example.com', 'AB_POSITIVE'),
    ('Aditya Singh', 'Male', '1993-07-18', 'aditya.singh@example.com', 'O_NEGATIVE'),
    ('Sneha Gupta', 'Female', '1991-12-25', 'sneha.gupta@example.com', 'B_NEGATIVE'),
    ('Karan Malhotra', 'Male', '1989-03-30', 'karan.malhotra@example.com', 'A_NEGATIVE'),
    ('Neha Hassaniya', 'Female', '1994-09-12', 'neha.hassaniya@example.com', 'AB_POSITIVE'),
    ('Vikram Patel', 'Male', '1987-06-05', 'vikram.patel@example.com', 'O_POSITIVE'),
    ('Ananya Roy', 'Female', '1996-04-27', 'ananya.roy@example.com', 'A_POSITIVE');


INSERT INTO doctor(name, specialization, email)
VALUES
    ('Dr. Anjali Sharma', 'Neurology', 'anjali.sharma@example.com'),
    ('Dr. Rajiv Kapor', 'Orthopedics', 'rajiv.kapor@example.com'),
    ('Dr. Meena Verma', 'Dermatology', 'meena.verma@example.com'),
    ('Dr. Arvind Gupta', 'Pediatrics', 'arvind.gupta@example.com'),
    ('Dr. Seema Nair', 'Gynecology', 'seema.nair@example.com');


INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
    ('2025-07-01 10:30:00', 'General Checkup', 1, 2),
    ('2025-07-02 11:00:00', 'Cardiology Consultation', 2, 1),
    ('2025-07-03 09:15:00', 'Orthopedic Follow-up', 3, 3),
    ('2025-07-04 14:45:00', 'Dermatology Skin Allergy', 4, 7),
    ('2025-07-05 16:00:00', 'Pediatric Routine Check', 5, 5),
    ('2025-07-06 12:30:00', 'ENT Consultation', 4, 2),
    ('2025-07-07 10:00:00', 'Gynecology Prenatal Visit', 4, 5),
    ('2025-07-08 15:15:00', 'Neurology Migraine Check', 5, 1),
    ('2025-07-09 11:45:00', 'Dental Cleaning', 3, 9),
    ('2025-07-10 13:00:00', 'Eye Vision Test', 1, 8);

