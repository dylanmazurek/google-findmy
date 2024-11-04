package defpackage;

import android.util.Log;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgz {
    public final cfc a;
    public final chd b;

    public cgz() {
        throw null;
    }

    public static cgz a(cfc cfcVar) {
        return new cgz(cfcVar, ((cgq) cfcVar).aE());
    }

    public static boolean b(int i) {
        if (Log.isLoggable("LoaderManager", i)) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final void c(String str, PrintWriter printWriter) {
        chd chdVar = this.b;
        if (chdVar.b.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < chdVar.b.c(); i++) {
                String concat = str.concat("    ");
                cha chaVar = (cha) chdVar.b.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(chdVar.b.b(i));
                printWriter.print(": ");
                printWriter.println(chaVar.toString());
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(chaVar.a);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(concat);
                printWriter.print("mLoader=");
                printWriter.println(chaVar.h);
                chg chgVar = chaVar.h;
                String concat2 = concat.concat("  ");
                printWriter.print(concat2);
                printWriter.print("mId=");
                printWriter.print(chgVar.d);
                printWriter.print(" mListener=");
                printWriter.println(chgVar.j);
                if (chgVar.f || chgVar.i) {
                    printWriter.print(concat2);
                    printWriter.print("mStarted=");
                    printWriter.print(chgVar.f);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(chgVar.i);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (chgVar.g || chgVar.h) {
                    printWriter.print(concat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(chgVar.g);
                    printWriter.print(" mReset=");
                    printWriter.println(chgVar.h);
                }
                chf chfVar = (chf) chgVar;
                if (chfVar.a != null) {
                    printWriter.print(concat2);
                    printWriter.print("mTask=");
                    printWriter.print(chfVar.a);
                    printWriter.print(" waiting=");
                    boolean z = chfVar.a.a;
                    printWriter.println(false);
                }
                if (chfVar.b != null) {
                    printWriter.print(concat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(chfVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = chfVar.b.a;
                    printWriter.println(false);
                }
                if (chaVar.i != null) {
                    printWriter.print(concat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(chaVar.i);
                    chb chbVar = chaVar.i;
                    printWriter.print(concat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(chbVar.b);
                }
                printWriter.print(concat);
                printWriter.print("mData=");
                chg chgVar2 = chaVar.h;
                printWriter.println(chg.e(chaVar.d()));
                printWriter.print(concat);
                printWriter.print("mStarted=");
                printWriter.println(chaVar.m());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.a.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.a)));
        sb.append("}}");
        return sb.toString();
    }

    public cgz(cfc cfcVar, ddh ddhVar) {
        this.a = cfcVar;
        this.b = (chd) new ddh(ddhVar, chd.a).q(chd.class);
    }
}
