package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bai implements ban {
    protected String a;
    private final int[] b = new int[2];

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        mpd.b("text");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] b(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int[] iArr = this.b;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        return null;
    }
}
