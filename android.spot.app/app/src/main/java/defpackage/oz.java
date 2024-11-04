package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oz {
    public final int a;
    public final int b;
    public final Object c;

    public oz() {
        this.c = new oz[256];
        this.b = 0;
        this.a = 0;
    }

    public final int a(boolean z) {
        if (z) {
            return this.b;
        }
        return this.a;
    }

    public oz(int i, int i2) {
        this.c = null;
        this.b = i;
        int i3 = i2 & 7;
        this.a = i3 == 0 ? 8 : i3;
    }

    public oz(int i, int i2, moh mohVar) {
        this.a = i;
        this.b = i2;
        this.c = mohVar;
    }

    public oz(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.a = i;
        this.b = i2;
    }
}
