package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdh extends kll {
    public final int a;
    public final kdg b;

    public kdh(int i, kdg kdgVar) {
        this.a = i;
        this.b = kdgVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.b != kdg.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kdh)) {
            return false;
        }
        kdh kdhVar = (kdh) obj;
        if (kdhVar.a != this.a || kdhVar.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kdh.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
