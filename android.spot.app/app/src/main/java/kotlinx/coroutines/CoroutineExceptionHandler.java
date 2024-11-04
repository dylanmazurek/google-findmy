package kotlinx.coroutines;

import defpackage.bcr;
import defpackage.mmz;
import defpackage.mnb;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends mmz {
    public static final bcr a = bcr.e;

    void handleException(mnb mnbVar, Throwable th);
}
