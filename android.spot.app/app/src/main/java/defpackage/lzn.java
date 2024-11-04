package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzn {
    public static final lyo a = new lyo("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final lyp c;
    private final int d;

    public lzn(SocketAddress socketAddress) {
        this(socketAddress, lyp.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzn)) {
            return false;
        }
        lzn lznVar = (lzn) obj;
        if (this.b.size() != lznVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!((SocketAddress) this.b.get(i)).equals(lznVar.b.get(i))) {
                return false;
            }
        }
        if (this.c.equals(lznVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        lyp lypVar = this.c;
        return "[" + String.valueOf(this.b) + "/" + lypVar.toString() + "]";
    }

    public lzn(SocketAddress socketAddress, lyp lypVar) {
        List singletonList = Collections.singletonList(socketAddress);
        hwx.K(!singletonList.isEmpty(), "addrs is empty");
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(singletonList));
        this.b = unmodifiableList;
        lypVar.getClass();
        this.c = lypVar;
        this.d = unmodifiableList.hashCode();
    }
}
