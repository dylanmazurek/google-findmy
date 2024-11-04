package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsa implements hoc {
    public final int a;
    public final jer b;
    private final int c;

    public hsa() {
        throw null;
    }

    public static final hrz c() {
        hrz hrzVar = new hrz(null);
        hrzVar.a = 50;
        hrzVar.c = (byte) 3;
        hrzVar.b = jdl.a;
        hrzVar.d = 1;
        return hrzVar;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        if (this.c == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hsa)) {
            return false;
        }
        hsa hsaVar = (hsa) obj;
        int i = this.c;
        int i2 = hsaVar.c;
        if (i != 0) {
            if (i == i2 && this.a == hsaVar.a && this.b.equals(hsaVar.b)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.N(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=" + hod.a(this.c) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=false, metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }

    public hsa(int i, int i2, jer jerVar) {
        this.c = i;
        this.a = i2;
        this.b = jerVar;
    }
}
