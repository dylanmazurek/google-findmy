package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iar {
    public boolean a;
    public byte b;
    public int c;

    public final ias a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new ias(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" batteryLevel");
        }
        if (this.b == 0) {
            sb.append(" unwantedTrackingModeEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void d(int i) {
        if (i != 0) {
            this.c = i;
            return;
        }
        throw new NullPointerException("Null isUnicornUser");
    }
}
