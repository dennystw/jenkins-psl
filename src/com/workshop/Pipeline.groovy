package com.workshop

import com.workshop.Config

class Pipeline {
    String repository_name
    String branch_name
    String git_user
    String docker_user
    String app_port
    String pr_num
    String dockerTool

    // Set pipeline struct / constructor / test jenkins job asdad aaaa
    // Set pipeline struct / constructor / test jenkins job asdad aaaa
   Pipeline(String repository_name, String branch_name, String git_user, String docker_user, String app_port, String pr_num,
       String dockerTool){
       this.repository_name = repository_name
       this.branch_name = branch_name
       this.git_user = git_user
       this.docker_user = docker_user
       this.app_port = app_port
       this.pr_num = pr_num
       this.dockerTool = dockerTool
   }
}