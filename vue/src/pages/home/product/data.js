const tableItem = {
  date: "2020-02-02", // 日期
  name: "王者", // 姓名
  phone: "18866681688", // 电话
  address: "广州市天河区广州大道北 168 号" // 地址
};
// 此处先以 tableItem 为数据源，拷贝生成 20 个数据，然后再根据索引 index 添加上 id
const tableData = Array(20)
  .fill(tableItem)
  .map((x, i) => {
    return { id: i + 1, ...x };
  });
export default tableData;