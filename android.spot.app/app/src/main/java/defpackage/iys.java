package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iys extends dug implements iyt {
    public iys() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                duh.b(parcel);
            } else {
                Bundle bundle = (Bundle) duh.a(parcel, Bundle.CREATOR);
                duh.b(parcel);
                b(bundle);
            }
        } else {
            Bundle bundle2 = (Bundle) duh.a(parcel, Bundle.CREATOR);
            duh.b(parcel);
            c(bundle2);
        }
        return true;
    }
}
