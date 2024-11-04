package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htg {
    public float a;
    public byte b;
    public int c;

    public final hth a() {
        int i;
        boolean z = true;
        if (this.b == 1 && (i = this.c) != 0) {
            hth hthVar = new hth(i, this.a);
            float f = hthVar.a;
            if (f < 0.0f || f > 1.0f) {
                z = false;
            }
            hwx.V(z, "Probability shall be between 0 and 1.");
            return hthVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.c = i;
    }
}
