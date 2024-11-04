package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkv extends hlc {
    private final fhz a;
    private final Status b;

    public hkv(fhz fhzVar, Status status) {
        if (fhzVar != null) {
            this.a = fhzVar;
            if (status != null) {
                this.b = status;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null result");
    }

    @Override // defpackage.hlc
    public final fhz a() {
        return this.a;
    }

    @Override // defpackage.hlc
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hlc) {
            hlc hlcVar = (hlc) obj;
            if (this.a.equals(hlcVar.a()) && this.b.equals(hlcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
