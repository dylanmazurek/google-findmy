package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doe implements dnq {
    private final Context a;
    private final Class b;

    public doe(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.dnq
    public final dnp b(dnu dnuVar) {
        Class cls = this.b;
        return new dog(this.a, dnuVar.a(File.class, cls), dnuVar.a(Uri.class, cls), cls);
    }
}
