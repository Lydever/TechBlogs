
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * XLS����
 */
public class UnitXLS implements GameConfig {

	public static void AddXls(List<Map<String, String>> list, String filePath, String[] queue) {
		// Excel�ĵ�
		Workbook wb = null;
		// Excel�ĵ��е�һ��sheet
		Sheet sheet = null;
		// ��Ӧһ��sheet�е�һ��
		Row row = null;

		String cellData = null;

		// ��xls��ֵ��wb
		wb = readExcel(filePath);
		if (wb != null) {
			// ������ű�������
			// list = new ArrayList<Map<String, String>>();
			// ��ȡ��һ��sheet
			sheet = wb.getSheetAt(0);
			// ��ȡ�������
			int rownum = sheet.getPhysicalNumberOfRows();
			// ��ȡ��һ��
			row = sheet.getRow(0);
			// ��ȡ�������
			int colnum = row.getPhysicalNumberOfCells();
			for (int i = 1; i < rownum; i++) {
				Map<String, String> map = new LinkedHashMap<String, String>();
				row = sheet.getRow(i);
				if (row != null) {
					for (int j = 0; j < colnum; j++) {
						cellData = (String) getCellFormatValue(row.getCell(j));
						map.put(queue[j], cellData);
					}
				} else {
					break;
				}
				list.add(map);
			}
		}
		// ��������������list
		// for (Map<String,String> map : list) {
		// for (Entry<String,String> entry : map.entrySet()) {
		// System.out.print(entry.getKey()+":"+entry.getValue()+",");
		// }
		// System.out.println();
		// }
	}

	/**
	 * @param ID
	 * 
	 * @return string���͵�ȫ����Ϣ
	 */
	// IDΪ�ڼ��У�����ʹ�������������ʹ���������ǰ��Ҫ������AddXls��ʼ��
	public static String ȡ����(List<Map<String, String>> list, int ID) {
		return String.valueOf(list.get(ID));
	}

	// ��ȡexcel
	public static Workbook readExcel(String filePath) {
		Workbook wb = null;
		// ���û�и��ĵ�
		if (filePath == null) {
			return null;
		}
		// ȡ�ļ���׺��
		String extString = filePath.substring(filePath.lastIndexOf("."));
		InputStream is = null;
		try {
			is = new FileInputStream(filePath);
			if (".xls".equals(extString)) {
				return wb = new HSSFWorkbook(is);
			} else if (".xlsx".equals(extString)) {
				return wb = new XSSFWorkbook(is);
			} else {
				return wb = null;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wb;
	}

	/**
	 * ��ȡ��Ԫ���е�ֵ��ת����string
	 * 
	 * @param cell
	 *            ��Ԫ��
	 * @return
	 */
	public static Object getCellFormatValue(Cell cell) {
		Object cellValue = null;
		if (cell != null) {
			// �ж�cell����
			switch (cell.getCellType()) {
			case NUMERIC: {
				cellValue = String.valueOf(cell.getNumericCellValue());
				break;
			}
			case STRING: {
				cellValue = cell.getRichStringCellValue().getString();
				break;
			}
			default:
				cellValue = "";
			}
		} else {
			cellValue = "";
		}
		return cellValue;
	}

}
