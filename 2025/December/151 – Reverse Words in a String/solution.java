class Solution {
    public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int n = chars.length;

    // Step 1: Reverse entire string
    reverse(chars, 0, n - 1);

    // Step 2: Reverse each word
    int start = 0;
    for (int i = 0; i <= n; i++) {
        if (i == n || chars[i] == ' ') {
            if (i > start) {
                reverse(chars, start, i - 1);
            }
            start = i + 1;
        }
    }

    // Step 3: Clean up spaces
    int write = 0;
    int i = 0;
    while (i < n) {
        if (chars[i] != ' ') {
            if (write != 0) {
                chars[write++] = ' ';
            }
            while (i < n && chars[i] != ' ') {
                chars[write++] = chars[i++];
            }
        }
        i++;
    }

    return new String(chars, 0, write);
}

private void reverse(char[] chars, int left, int right) {
    while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
    }
}
}
