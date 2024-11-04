package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class meu extends mbo {
    private static final boolean a = mjo.G(meu.class.getClassLoader());

    @Override // defpackage.mbj
    public final mbn a(URI uri, mbh mbhVar) {
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            path.getClass();
            hwx.S(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String substring = path.substring(1);
            uri.getAuthority();
            return new met(substring, mbhVar, mfh.l, new jfd(), a);
        }
        return null;
    }

    @Override // defpackage.mbj
    public final String b() {
        return "dns";
    }

    @Override // defpackage.mbo
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mbo
    public final void d() {
    }

    @Override // defpackage.mbo
    public final void e() {
    }
}
