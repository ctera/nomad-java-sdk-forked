// jte{
//     pipeline_template = "Jenkinsfile_rpm"
// }

libraries{    
    maven{
       pom_full_name = "sdk/pom.xml"
    }    
}

// stages{
//     _continuous_integration{
//         _are_changes_detected
//         _build
//         _copy_rpm_and_update_oss
//     }
// }

