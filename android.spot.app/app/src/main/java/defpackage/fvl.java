package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvl extends fvi {
    final /* synthetic */ bym a;

    public fvl(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fvi
    public final void c(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
        if (status.a()) {
            int i = backupAndSyncOptInState.c;
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 0;
                    }
                }
            }
            fma.ba(status, new DeviceContactsSyncSetting(i2), this.a);
            return;
        }
        fma.ba(status, null, this.a);
    }
}
