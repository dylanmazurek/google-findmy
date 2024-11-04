package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzh implements bzi {
    private final Uri a;
    private final ClipDescription b;
    private final Uri c;

    public bzh(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = uri;
        this.b = clipDescription;
        this.c = uri2;
    }

    @Override // defpackage.bzi
    public final ClipDescription a() {
        return this.b;
    }

    @Override // defpackage.bzi
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.bzi
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.bzi
    public final Object d() {
        return null;
    }

    @Override // defpackage.bzi
    public final void e() {
    }
}
