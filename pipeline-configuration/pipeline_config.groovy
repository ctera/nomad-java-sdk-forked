// jte{
//     pipeline_template = "Jenkinsfile_rpm"
// }

libraries{    
    maven  
}

// stages{
//     _continuous_integration{
//         _are_changes_detected
//         _build
//         _copy_rpm_and_update_oss
//     }
// }

application_environments{
    pom{
        location = "sdk"
    }
}

