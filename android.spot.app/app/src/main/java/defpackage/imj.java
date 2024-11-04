package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imj {
    public final lkq a;
    private final lja b;

    public imj() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [lkq, java.lang.Object] */
    public final lkq a(InputStream inputStream) {
        return this.a.q().h(inputStream, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imj) {
            imj imjVar = (imj) obj;
            if (this.a.equals(imjVar.a) && this.b.equals(imjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        lja ljaVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + ljaVar.toString() + "}";
    }

    public imj(lkq lkqVar, lja ljaVar) {
        if (lkqVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = lkqVar;
        if (ljaVar != null) {
            this.b = ljaVar;
            return;
        }
        throw new NullPointerException("Null extensionRegistryLite");
    }
}
