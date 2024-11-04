package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fjz {
    public final Feature[] b;
    public final boolean c;
    public final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public fjz(Feature[] featureArr, boolean z, int i) {
        this.b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(fhh fhhVar, bym bymVar);
}
