package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyi {
    public static final jnk a = jnk.l("com/google/android/apps/adm/util/ImageBytesHelper");
    public final jzd b;
    public final File c;

    public eyi(Context context, jzd jzdVar) {
        this.b = jzdVar;
        this.c = context.getDir("images", 0);
    }
}
