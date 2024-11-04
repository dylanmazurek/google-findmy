package defpackage;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezy extends HttpEntityWrapper {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ezy(HttpEntity httpEntity, String str, int i, long j, long j2, long j3, long j4) {
        super(httpEntity);
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final InputStream getContent() {
        return new ezx(this, super.getContent());
    }
}
