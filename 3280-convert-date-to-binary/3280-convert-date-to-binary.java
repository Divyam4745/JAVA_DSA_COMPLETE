
class Solution {
    public String convertDateToBinary(String date) {

        // Split date into year, month and day
        String[] parts = date.split("-");

        // Convert each part into binary
        String year = Integer.toBinaryString(Integer.parseInt(parts[0]));
        String month = Integer.toBinaryString(Integer.parseInt(parts[1]));
        String day = Integer.toBinaryString(Integer.parseInt(parts[2]));

        // Join all binary values
        return year + "-" + month + "-" + day;
    }
}
