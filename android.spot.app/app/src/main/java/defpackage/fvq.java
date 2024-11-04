package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;
import com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse;
import com.google.android.gms.people.cpg.ActionPreference;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.GroupContactOrder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fvq(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 495
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvq.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new BackupAndSyncSuggestion[i];
            case 1:
                return new BackupAndSyncOptInState[i];
            case 2:
                return new BackupSyncContactInfo[i];
            case 3:
                return new DeviceContactsSyncSetting[i];
            case 4:
                return new ExtendedSyncStatus[i];
            case 5:
                return new GetBackupSyncSuggestionResponse[i];
            case 6:
                return new RecordBackupSyncUserActionResponse[i];
            case 7:
                return new ActionPreference[i];
            case 8:
                return new CpgDocument[i];
            case 9:
                return new GroupContactOrder[i];
            case 10:
                return new MatrixCursorParcelable[i];
            case 11:
                return new SyncStatus[i];
            case 12:
                return new BackedUpContactsPerDeviceEntity[i];
            case 13:
                return new BirthdayEntity[i];
            case 14:
                return new DeviceVersionEntity[i];
            case 15:
                return new EmailEntity[i];
            case 16:
                return new FetchBackUpDeviceContactInfoResponseEntity[i];
            case 17:
                return new NameEntity[i];
            case 18:
                return new PersonEntity[i];
            case 19:
                return new PersonFieldMetadataEntity[i];
            default:
                return new PhoneEntity[i];
        }
    }
}
