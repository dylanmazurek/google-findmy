package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdh {
    private int a;
    private int b;
    private int c;
    private byte d;

    public final hdi a() {
        if (this.d != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.d & 1) == 0) {
                sb.append(" cardCellId");
            }
            if ((this.d & 2) == 0) {
                sb.append(" cardMainActionId");
            }
            if ((this.d & 4) == 0) {
                sb.append(" cardSecondaryActionId");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new hdi(this.a, this.b, this.c);
    }

    public final void b(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    public final void c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void d(int i) {
        this.c = i;
        this.d = (byte) (this.d | 4);
    }
}
