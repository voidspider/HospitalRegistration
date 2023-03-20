<template>
<div>
    <Row class="header">
        <img src="../../assets/logo1.png" width="220px">
        <div class="description">基于Vue和SpringBoot的通用管理系统</div>
    </Row>
</div>
</template>

<script>
export default {
    name: "header"
};
</script>

<style lang="less">
.header {
    margin-top: 8vh;
    margin-bottom: 5vh;
    text-align: center;

    .description {
        font-size: 14px;
        color: #ffffff;
        margin-top: 1vh;
    }
}
</style>
