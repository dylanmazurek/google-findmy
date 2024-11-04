package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfl {
    public static final /* synthetic */ int b = 0;
    public final boolean a;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private String n;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        timeUnit.toSeconds(2147483647L);
    }

    public nfl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i3;
        this.k = i4;
        this.a = z6;
        this.l = z7;
        this.m = z8;
        this.n = str;
    }

    public final String toString() {
        String str = this.n;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c) {
                sb.append("no-cache, ");
            }
            if (this.d) {
                sb.append("no-store, ");
            }
            if (this.e != -1) {
                sb.append("max-age=");
                sb.append(this.e);
                sb.append(", ");
            }
            if (this.f != -1) {
                sb.append("s-maxage=");
                sb.append(this.f);
                sb.append(", ");
            }
            if (this.g) {
                sb.append("private, ");
            }
            if (this.h) {
                sb.append("public, ");
            }
            if (this.i) {
                sb.append("must-revalidate, ");
            }
            if (this.j != -1) {
                sb.append("max-stale=");
                sb.append(this.j);
                sb.append(", ");
            }
            if (this.k != -1) {
                sb.append("min-fresh=");
                sb.append(this.k);
                sb.append(", ");
            }
            if (this.a) {
                sb.append("only-if-cached, ");
            }
            if (this.l) {
                sb.append("no-transform, ");
            }
            if (this.m) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            this.n = sb2;
            return sb2;
        }
        return str;
    }
}
