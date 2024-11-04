package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsv {
    public byte a;
    public int b;
    public Object c;

    public hsv() {
        throw null;
    }

    public final hsw a() {
        int i;
        if (this.a == 1 && (i = this.b) != 0) {
            return new hsw(i, (jer) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final hof b() {
        int i;
        Object obj;
        if (this.a == 1 && (i = this.b) != 0 && (obj = this.c) != null) {
            return new hof(i, (hog) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.b = i;
    }

    public hsv(byte[] bArr) {
        this.c = jdl.a;
    }

    public hsv(char[] cArr) {
    }
}
