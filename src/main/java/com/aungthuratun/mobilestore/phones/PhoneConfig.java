// package com.aungthuratun.mobilestore.phones;

// import java.util.List;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class PhoneConfig {
//     @Bean
//     CommandLineRunner commandLineRunner(PhoneRepository phoneRepository){
//         return args->{
//             Phone turbo_4_pro = new Phone(
//                 "Turbo 4 Pro",
//                 16,
//                 2500000L
//             );

//             Phone galaxy_note_4 = new Phone(
//                 "Galaxy Note 4",
//                 16,
//                 2500000L
//             );

//             phoneRepository.saveAll(List.of(turbo_4_pro,galaxy_note_4));
//         };
//     }

// }
