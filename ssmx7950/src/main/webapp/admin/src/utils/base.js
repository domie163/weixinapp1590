const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmx7950/",
            name: "ssmx7950",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmx7950/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "党建工作小秘书"
        } 
    }
}
export default base
