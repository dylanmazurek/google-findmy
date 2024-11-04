package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mgw extends mbo {
    final SocketAddress a;
    final String b;
    final Collection c;

    public mgw(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.mbj
    public final mbn a(URI uri, mbh mbhVar) {
        return new mgv(this);
    }

    @Override // defpackage.mbj
    public final String b() {
        return "directaddress";
    }

    @Override // defpackage.mbo
    public final Collection c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mbo
    public final void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mbo
    public final void e() {
    }
}
