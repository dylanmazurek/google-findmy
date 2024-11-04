package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvs extends jql {
    public static final char[] a = {'+'};
    public static final char[] b = "0123456789ABCDEF".toCharArray();
    public final boolean c;
    public final boolean[] d;

    public jvs(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            if (z && concat.contains(" ")) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            this.c = z;
            char[] charArray = concat.toCharArray();
            int i = -1;
            for (char c : charArray) {
                i = Math.max((int) c, i);
            }
            boolean[] zArr = new boolean[i + 1];
            for (char c2 : charArray) {
                zArr[c2] = true;
            }
            this.d = zArr;
            return;
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }
}
