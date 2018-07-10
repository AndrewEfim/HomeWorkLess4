public class Patient {
        private String name;
        private String surname;
        private String diagnosis;
        private int age;
        private boolean isSick;

        public Patient(String name, String surname, String diagnosis, int age, boolean isSick) {
            this.name = name;
            this.surname = surname;
            this.diagnosis = diagnosis;
            this.age = age;
            this.isSick = isSick;
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }

        public String getDiagnosis() {
            return this.diagnosis;
        }

        public int getAge() {
            return this.age;
        }

        public boolean isSick() {
            return this.isSick;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "Имя='" + name + '\'' +
                    ", Фамилия='" + surname + '\'' +
                    ", Диагноз='" + diagnosis + '\'' +
                    ", Возраст=" + age +
                    ", Болен=" + isSick +
                    '}';
        }
    }
